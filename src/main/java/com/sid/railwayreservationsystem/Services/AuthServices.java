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


    public String signUpUser(Map<String,String> user) {
        Optional<User> userOptional = authenticationRepository.findUserByEmailAddress(user.get("emailAddress"));

        if(userOptional.isPresent())
        {
            return "Email Address already in use";

        }

        else if(user.get("email")==null || user.get("name")==null|| user.get("password")==null)
        {
            return "Bad Body Found";
        }
        else
        {

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
