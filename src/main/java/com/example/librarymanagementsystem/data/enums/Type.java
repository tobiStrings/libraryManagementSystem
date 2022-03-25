package com.example.librarymanagementsystem.data.enums;

import lombok.Data;

@Data
public class Type {
    public enum Class{
        SS1,SS2,SS3,JSS1,JSS2,JSS3
    }
    public enum Department{
        SCIENCE,ART,COMMERCIAL
    }
}
