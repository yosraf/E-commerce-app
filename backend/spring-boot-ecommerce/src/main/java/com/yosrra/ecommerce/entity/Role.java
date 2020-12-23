package com.yosrra.ecommerce.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role_name")
    private String roleName;

    @ManyToMany(mappedBy = "roles")
    private Set<User> user = new HashSet<>();

    /**
     * Gets the role id
     *
     * @return {@code Long} the role id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the role id
     *
     * @param id {@code Long} the role id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the role name
     *
     * @return {@code String} the role name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets the role name
     *
     * @param roleName {@code String} the role roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * Gets the user
     *
     * @return {@code  Set<User>} the user
     */
    public Set<User> getUser() {
        return user;
    }

    /**
     * Sets the user
     *
     * @return user  {@code  Set<User>} the user
     */
    public void setUser(Set<User> user) {
        this.user = user;
    }
}
