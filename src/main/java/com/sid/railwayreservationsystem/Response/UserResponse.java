package com.sid.railwayreservationsystem.Response;

import com.sid.railwayreservationsystem.Entity.User;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class UserResponse {

    String apiKey;
    String name;
    String email;
    String age;
    String aadhaarNumber;
    String gender;


    public UserResponse(User user)
    {
        this.apiKey=user.getApiKey();
        this.name = user.getName();
        this.email = user.getEmail();
        this.age=user.getAge();
        this.aadhaarNumber=user.getAadhaarNumber();
        this.gender = user.getGender();
    }




}
