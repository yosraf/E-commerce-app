package com.yosrra.ecommerce.service;

import com.yosrra.ecommerce.dto.UserDto;

public interface IUserService {

    UserDto saveUser(UserDto userDto);
    UserDto findUserByEmail(String email);
}
