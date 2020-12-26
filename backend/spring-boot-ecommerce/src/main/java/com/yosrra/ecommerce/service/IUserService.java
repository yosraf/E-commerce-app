package com.yosrra.ecommerce.service;

import com.yosrra.ecommerce.dto.UserDto;
import com.yosrra.ecommerce.dto.UserRegistrationRequest;

public interface IUserService {

    UserDto saveUser(UserRegistrationRequest userRegistrationRequest);

    UserDto findUserByEmail(String email);
}
