package com.sid.railwayreservationsystem.Controller;


import com.sid.railwayreservationsystem.Entity.User;
import com.sid.railwayreservationsystem.Services.AuthServices;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServer;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Map;

@RestController
@RequestMapping("api/v1/auth")
public class AuthController {


    @Autowired
    AuthServices authServices;

    @PostMapping("/signUp")
    public String signUpUser( @RequestParam  Map<String,String> user)
    {
        return authServices.signUpUser(user);
    }


    @PostMapping("/login")
    public String loginUser(@RequestParam Map<String,String> user){
        return authServices.loginUser(user);
    }


    



}
