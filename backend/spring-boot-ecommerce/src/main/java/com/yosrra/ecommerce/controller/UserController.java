package com.yosrra.ecommerce.controller;

import com.yosrra.ecommerce.dto.UserDto;
import com.yosrra.ecommerce.dto.UserRegistrationRequest;
import com.yosrra.ecommerce.security.JwtUserDetailService;
import com.yosrra.ecommerce.security.JwtUserDetails;
import com.yosrra.ecommerce.security.JwtUtils;
import com.yosrra.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This bean represents the user controller , the entry point to manipulates users
 *
 * @author yosra fatnassi
 */
@RestController
@RequestMapping("user/")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtils jwtUtils;

    @Autowired
    private JwtUserDetailService userDetailService;

    @PostMapping("register")
    public ResponseEntity<UserDto> register(@RequestBody UserRegistrationRequest userDto

    ) {
        UserDto user = userService.saveUser(userDto);
        return new ResponseEntity<>(user, HttpStatus.CREATED);

    }

    @PostMapping("authenticate")
    public ResponseEntity<String> generateToken(@RequestBody UserRegistrationRequest user) throws Exception {

        //authenticate(user.getEmail(), user.getPassword());
        JwtUserDetails userDetails = userDetailService.loadUserByUsername(user.getEmail());

        String token = jwtUtils.generateToken(userDetails);
        return new ResponseEntity<>(token, HttpStatus.OK);


    }

    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }


}
