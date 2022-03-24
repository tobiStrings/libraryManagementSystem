package com.example.librarymanagementsystem.data.repository.account;

import com.example.librarymanagementsystem.data.models.account.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account,String> {

}
