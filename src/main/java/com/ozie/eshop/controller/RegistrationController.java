package com.ozie.eshop.controller;

import com.ozie.eshop.dto.UserRegistrationRequest;
import com.ozie.eshop.model.User;
import com.ozie.eshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class RegistrationController {

    private final UserService userService;
  //  private final PasswordEncoder passwordEncoder;

    public RegistrationController(@Autowired UserService userService) {
        this.userService = userService;

    }

    @PostMapping("api/auth/register")
    public ResponseEntity<?> registerUser(@RequestBody UserRegistrationRequest request) {
        System.out.println(request.getEmail());
        User registeredUser = userService.registerUser(request);
        return ResponseEntity.ok("User registered successfully");
    }

}

