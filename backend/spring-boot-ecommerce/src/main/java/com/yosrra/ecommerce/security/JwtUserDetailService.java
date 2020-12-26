package com.yosrra.ecommerce.security;

import com.yosrra.ecommerce.dao.UserRepository;
import com.yosrra.ecommerce.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * This bean represents the user detail service
 *
 * @author yosra fatnassi
 */
@Service
public class JwtUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public JwtUserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = repository.findByEmail(email);
        JwtUserDetails details = new JwtUserDetails();
        details.setEmail(user.getEmail());
        return details;
    }
}
