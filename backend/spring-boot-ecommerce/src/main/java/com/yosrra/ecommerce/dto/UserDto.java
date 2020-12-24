package com.yosrra.ecommerce.dto;

import java.util.List;

/**
 * This class represent the entity user dto
 *
 * @author yosra fatnassi
 */
public class UserDto {

    private String firstName;
    private String lastName;
    private String email;
    private List<String> roles;

    /**
     * Gets the user first name
     *
     * @return {@code String} the user first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the user first name
     *
     * @param firstName the user first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the user last name
     *
     * @return {@code String} the user last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the user last name
     *
     * @param lastName the user last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the user  email
     *
     * @return {@code String} the user email
     */

    public String getEmail() {
        return email;
    }

    /**
     * Sets the user  email
     *
     * @param email the user email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the user  roles
     *
     * @return {@code List<String>} the user roles
     */
    public List<String> getRoles() {
        return roles;
    }

    /**
     * Sets the user  roles
     *
     * @param roles the user roles
     */
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
