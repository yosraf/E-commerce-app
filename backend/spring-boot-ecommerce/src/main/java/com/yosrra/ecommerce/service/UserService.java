package com.yosrra.ecommerce.service;

import com.yosrra.ecommerce.dao.UserRepository;
import com.yosrra.ecommerce.dto.UserDto;
import com.yosrra.ecommerce.dto.UserRegistrationRequest;
import com.yosrra.ecommerce.entity.Role;
import com.yosrra.ecommerce.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * This class contains the busniss logic to manipulates users
 *
 * @author yosra fatnassi
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder bCrypt;

    @Autowired
    private RoleService roleService;


    @Override
    public UserDto saveUser(UserRegistrationRequest userDto) {

        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setPassword(bCrypt.encode(userDto.getPassword()));
        Set<Role> roleSet = new HashSet<>();
        userDto.getRoles().forEach(role -> {
            Role r = roleService.findRoleByRoleName(role);
            roleSet.add(r);
            user.setRoles(roleSet);
        });
        User newUser =  userRepository.save(user);
        return newUser.toUserDto();
    }

    @Override
    public UserDto findUserByEmail(String email) {
        User user = userRepository.findByEmail(email);
        UserDto dto = null;
        if (user != null) {
            dto = user.toUserDto();
        }
        return dto;
    }

}
