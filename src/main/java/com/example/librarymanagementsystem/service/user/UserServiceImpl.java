package com.example.librarymanagementsystem.service.user;

import com.example.librarymanagementsystem.data.dtos.request.RegisterRequest;
import com.example.librarymanagementsystem.data.dtos.response.RegisterResponse;
import com.example.librarymanagementsystem.data.enums.Type;
import com.example.librarymanagementsystem.data.enums.UserType;
import com.example.librarymanagementsystem.data.models.account.Account;
import com.example.librarymanagementsystem.data.models.users.*;
import com.example.librarymanagementsystem.data.repository.account.AccountRepository;
import com.example.librarymanagementsystem.data.repository.users.*;
import com.example.librarymanagementsystem.exceptions.LibraryException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@EnableMongoRepositories
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StaffRepository staffRepository;
    @Autowired
    private LibrarianRepository librarianRepository;
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;



    @Override
    public RegisterResponse register(RegisterRequest request) throws LibraryException {
        validateRegisterRequest(request);
        Account account = new Account();
        account.setAccountOwner(request.getUserName());
        if (request.getUserType().equalsIgnoreCase("student")){
            User student = registerStudent(request,account);
            userRepository.save(student);
            return new RegisterResponse("Student " + request.getUserName() +
                    " has been registered successfully");
        }
        if (request.getUserType().equalsIgnoreCase("staff")){
            User staff = registerStaff(request,account);
            userRepository.save(staff);
            return new RegisterResponse("Staff "+request.getUserName()+" has been registered successfully");
        }
        if (request.getUserType().equalsIgnoreCase("librarian")){
            User librarian = registerLibrarian(request,account);
            userRepository.save(librarian);
            return new RegisterResponse("Librarian "+request.getUserName()+" has been registered successfully");
        }
        return null;
    }

    private Student registerStudent(RegisterRequest request, Account account){
        accountRepository.save(account);
        Student student = new Student();
        student.setName(request.getUserName());
        student.setPassword(bCryptPasswordEncoder.encode(request.getPassword()));
        student.setUserType(UserType.STUDENT);
        student.setUserAccount(account);
        student.setStudentsUserClass(Type.Class.valueOf(request.getClassNameOrDeptName()));
        return studentRepository.save(student);
    }

    private Staff registerStaff(RegisterRequest request,Account account){
        accountRepository.save(account);
        Staff staff = new Staff();
        staff.setName(request.getUserName());
        staff.setPassword(bCryptPasswordEncoder.encode(request.getPassword()));
        staff.setUserType(UserType.STAFF);
        staff.setUserAccount(account);
        staff.setDepartment(Type.Department.valueOf(request.getClassNameOrDeptName()));
        return staffRepository.save(staff);
    }

    private Librarian registerLibrarian(RegisterRequest request,Account account){
        accountRepository.save(account);
        Librarian librarian = new Librarian();
        librarian.setName(request.getUserName());
        librarian.setPassword(bCryptPasswordEncoder.encode(request.getPassword()));
        librarian.setUserType(UserType.LIBRARIAN);
        librarian.setUserAccount(account);
        return librarianRepository.save(librarian);
    }

    private void validateRegisterRequest(RegisterRequest request) throws LibraryException {
        if (request.getUserName().isEmpty()||request.getUserName().isBlank()){
            throw new LibraryException("Please Enter username");
        }
        if (request.getPassword().isBlank()||request.getPassword().isEmpty()){
            throw new LibraryException("Please Enter password");
        }
        if (request.getClassNameOrDeptName().isEmpty()||request.getClassNameOrDeptName().isBlank()){
            throw new LibraryException("Please enter class or department");
        }
        if (request.getUserType().isBlank()||request.getUserType().isBlank()){
            throw new LibraryException("Please enter usertype");
        }
    }
}
