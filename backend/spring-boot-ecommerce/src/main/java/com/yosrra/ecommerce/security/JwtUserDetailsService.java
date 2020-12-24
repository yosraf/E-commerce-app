package com.yosrra.ecommerce.security;

import com.yosrra.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * This class allow to define user details service
 *
 * @author yosra fatnassi
 */
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Autowired
    private UserService userService;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }

}
