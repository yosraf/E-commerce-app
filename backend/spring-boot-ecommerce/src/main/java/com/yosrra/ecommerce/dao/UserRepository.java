package com.yosrra.ecommerce.dao;

import com.yosrra.ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * This bean represents the userRepository that communicates directly with db
 *
 * @author yosra fatnassi
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(@Param("email") String email);

    @Override
    User save(User user);
}
