package com.ozie.eshop.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:8081")
public class LoginController {

//    private AuthenticationManager authenticationManager;
//    @Autowired
//    private UserService userService;

//    @PostMapping("/login")
//    public ResponseEntity<?> authenticateUser(@RequestBody UserLoginRequest request) {
//
//        Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
//        );
//
//
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//
//        return ResponseEntity.ok("User logged in successfully");
//    }
}
