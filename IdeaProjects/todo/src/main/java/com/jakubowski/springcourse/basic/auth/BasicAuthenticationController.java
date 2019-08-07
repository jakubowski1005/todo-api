package com.jakubowski.springcourse.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class BasicAuthenticationController {

    @GetMapping("/basicauth")
    public AuthenticationBean authenticationBean() {
        //throw new RuntimeException("Something went wrong");
        return new AuthenticationBean("You are authenticated");
    }
}
