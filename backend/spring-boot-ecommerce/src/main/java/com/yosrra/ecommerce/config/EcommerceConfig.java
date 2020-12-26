package com.yosrra.ecommerce.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * This bean represent the e-commerce project config
 *
 * @author yosra fatnassi
 */
@Configuration
@PropertySources({
        @PropertySource("classpath:application.properties")})
public class EcommerceConfig {

    @Value("${jwt.secret}")
    private String jwtSecret;
    @Value("${jwt.expiration}")
    private String expiration;

    /**
     * Gets the jwt secret
     *
     * @return {code String} the jwt secret
     */
    public String getJwtSecret() {
        return jwtSecret;
    }

    /**
     * Sets the jwt secret
     *
     * @param jwtSecret the jwt secret
     */
    public void setJwtSecret(String jwtSecret) {
        this.jwtSecret = jwtSecret;
    }

    /**
     * Gets the jwt expiration
     *
     * @return {@code String} the jwt expiration
     */
    public String getExpiration() {
        return expiration;
    }

    /**
     * Sets the jwt expiration
     *
     * @param expiration the jwt expiration
     */
    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }
}
