package com.yosrra.ecommerce.service;

import com.yosrra.ecommerce.dao.RoleRepository;
import com.yosrra.ecommerce.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService implements IRoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findRoleByRoleName(String role) {
        return roleRepository.findByRoleName(role);
    }
}
