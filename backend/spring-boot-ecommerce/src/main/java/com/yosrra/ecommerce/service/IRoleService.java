package com.yosrra.ecommerce.service;

import com.yosrra.ecommerce.entity.Role;

public interface IRoleService {

    Role findRoleByRoleName(String role);
}
