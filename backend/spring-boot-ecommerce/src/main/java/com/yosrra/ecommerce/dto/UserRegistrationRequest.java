package com.yosrra.ecommerce.dto;

public class UserRegistrationRequest extends UserDto {

    private String password;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
