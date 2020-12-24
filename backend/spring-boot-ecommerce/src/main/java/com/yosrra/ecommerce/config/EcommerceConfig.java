package com.yosrra.ecommerce.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * This bean represent the e-commerce project config
 */
@Configuration
@PropertySources({
        @PropertySource("classpath:application.properties")})
public class EcommerceConfig {

    @Value("${jwt.secret}")
    private String jwtSecret;

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
}
