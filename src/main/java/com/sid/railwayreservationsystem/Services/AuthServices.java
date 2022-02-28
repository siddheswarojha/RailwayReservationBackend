package com.sid.railwayreservationsystem.Services;


import com.sid.railwayreservationsystem.Entity.User;
import com.sid.railwayreservationsystem.Repository.AuthenticationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@Service
public class AuthServices {

    @Autowired
    AuthenticationRepository authenticationRepository;


    public String signUpUser(Map<String, String> user) {
        Optional<User> userOptional = authenticationRepository.findUserByEmail(user.get("email"));

        if(userOptional.isPresent())
        {
            return "Email Address already in use";

        }

        else if(user.get("email")==null || user.get("name")==null|| user.get("password")==null)
        {
//            System.out.println(user.get("email"));
//            System.out.println(user.get("name"));
//            System.out.println(user.get("password"));
            return "Bad Body Found";
        }
        else
        {

            String key =UUID.randomUUID().toString();
            User userObj = new User();

            userObj.setApiKey(key);
            userObj.setEmail(user.get("email"));
            userObj.setName(user.get("name"));
            userObj.setPassword(user.get("password"));
            userObj.setAge(user.get("age"));
            userObj.setAadhaarNumber(user.get("aadhaarNumber"));
            userObj.setGender(user.get("gender"));

            authenticationRepository.save(userObj);
            return "Registered";
        }

    }

    public String loginUser(Map<String, String> user) {

        User user1 = authenticationRepository.findUserByEmail(user.get("email"))
                .orElseThrow(() -> new IllegalStateException("User Not Found!"));


        if (user.get("password").equals(user1.getPassword()))
        {
            return user1.getApiKey();
        }
        else
        {
            return "Wrong Password";
        }

    }
}
