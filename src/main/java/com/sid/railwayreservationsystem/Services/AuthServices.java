package com.sid.railwayreservationsystem.Services;


import com.sid.railwayreservationsystem.Entity.User;
import org.springframework.stereotype.Service;

@Service
public class AuthServices {
    public String signUpUser(User user) {
      //todo --> signup

        return "registered";
    }
}
