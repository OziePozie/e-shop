package com.ozie.eshop.service;

import com.ozie.eshop.dto.UserRegistrationRequest;
import com.ozie.eshop.model.User;
import com.ozie.eshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService /*implements UserDetailsService */{

    @Autowired
    UserRepository userRepository;


    public User findByUsername(String name){

        return userRepository.findByUsername(name);
    }

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("Пользователь не найден");
//        }
//        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), new ArrayList<>());
//    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public User registerUser(UserRegistrationRequest request) {

        if (userRepository.findByUsername(request.getEmail()) != null) {
            throw new RuntimeException("User with this email already exists");
        }

        User user = new User();
        user.setEmail(request.getEmail());

        user.setPassword(request.getPassword());

        return userRepository.save(user);
    }

}
