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

        if (userOptional.isPresent()) {
            return "Email Address already in use";

        } else if (user.get("email") == null) {

            System.out.println(user.get("email"));
            return "Bad Body Found";
        } else {

            String key = UUID.randomUUID().toString();
//            Optional<User> apiKey = userRepository.findUserByApiKey(key);
//
//            if(apiKey.isPresent())
//            {
//
//            }

            User userObj = new User();
            userObj.setApiKey(key);
            userObj.setEmail(user.get("emailAddress"));
            userObj.setName(user.get("name"));
            userObj.setPassword(user.get("password"));
            authenticationRepository.save(userObj);
            return "Registered";
        }

    }
}
