package com.sid.railwayreservationsystem.Entity;


import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Document(collection = "User")
@Component
public class User {

    @Id
    ObjectId _id;
    String apiKey;
    String name;
    String email;
    String password;
    String age;
    String aadhaarNumber;
    String gender;


    public User(String apiKey,String name, String email, String password, String age, String aadhaarNumber, String gender) {
        this.apiKey=apiKey;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.aadhaarNumber = aadhaarNumber;
        this.gender = gender;
    }

    public User(){
    }

}
