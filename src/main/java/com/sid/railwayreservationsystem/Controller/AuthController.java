package com.sid.railwayreservationsystem.Controller;


import com.sid.railwayreservationsystem.Entity.User;
import com.sid.railwayreservationsystem.Services.AuthServices;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
public class AuthController {


    @Autowired
    AuthServices authServices;

    @GetMapping("/signUp")
    public String signUpUser(User user)
    {
        return authServices.signUpUser(user);
    }



}
