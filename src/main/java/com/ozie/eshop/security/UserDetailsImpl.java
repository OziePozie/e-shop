//package com.ozie.eshop.security;
//
//
//import com.ozie.eshop.model.User;
//import lombok.NoArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Component;
//
//import java.util.Collection;
//import java.util.stream.Collectors;
//
//@Component
//@NoArgsConstructor
//public class UserDetailsImpl implements UserDetails {
//
//    private User user;
//
//    public UserDetailsImpl(User user) {
//        this.user = user;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return user.getRoles()
//                .stream()
//                .map(role -> new SimpleGrantedAuthority(role.toString()))
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public String getPassword() {
//
//        return user.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//
//        return user.getUsername();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//
//    public Long getId() {
//
//        return user.getId();
//    }
//}
