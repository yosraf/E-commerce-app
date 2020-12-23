package com.yosrra.ecommerce.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "User")
public class User implements Serializable {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", unique = true)
    private String email;

    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    /**
     * Gets the user id
     *
     * @return {@code Long} the user id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the user id
     *
     * @param id the user id
     */

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the user firstname
     *
     * @return {@code String} the user firstname
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the user firstname
     *
     * @param firstName the user firstname
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the user lastName
     *
     * @return {@code String} the user lastName
     */
    public String getLasttName() {
        return lastName;
    }

    /**
     * Sets the user lasttName
     *
     * @param lastName the user lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the user email
     *
     * @return {@code String} the user email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the user email
     *
     * @param email the user email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the user roles
     *
     * @return {@code Set} the user roles
     */
    public Set<Role> getRoles() {
        return roles;
    }

    /**
     * Sets the user roles
     *
     * @param roles the user roles
     */
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
