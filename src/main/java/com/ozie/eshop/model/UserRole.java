package com.ozie.eshop.model;

import org.springframework.security.core.GrantedAuthority;

public enum UserRole implements GrantedAuthority {

    USER("USER"),
    ADMIN("ADMIN");

    UserRole(String user) {
    }


    @Override
    public String getAuthority() {
        return name();
    }
}
