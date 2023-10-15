package com.ozie.eshop.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRegistrationRequest {


    private String email;
    private String password;
}
