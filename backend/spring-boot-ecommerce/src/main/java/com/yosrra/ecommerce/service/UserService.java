package com.yosrra.ecommerce.service;

import com.yosrra.ecommerce.dao.UserRepository;
import com.yosrra.ecommerce.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDto saveUser(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto findUserByEmail(String email) {
        return null;
    }
}
