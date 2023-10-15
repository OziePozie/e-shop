package com.ozie.eshop.model;



public enum UserRole /*implements GrantedAuthority*/ {

    USER("USER"),
    ADMIN("ADMIN");

    UserRole(String user) {
    }

    public String getAuthority() {
        return name();
    }
}
