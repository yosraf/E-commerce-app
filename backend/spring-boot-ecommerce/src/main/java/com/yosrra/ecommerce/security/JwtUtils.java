package com.yosrra.ecommerce.security;

import com.yosrra.ecommerce.config.EcommerceConfig;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * This bean represents the token utils class
 *
 * @author yosra fatnassi
 */
@Component
public class JwtUtils {
    @Autowired
    EcommerceConfig config;

    /**
     * This method allow to extract user's email from jwt
     *
     * @param token the jwt
     * @return {@code String} the user's email
     */
    public String getEmailFromToken(String token) {
        return getClaimFromToken(token, Claims::getSubject);
    }


    /**
     * This method allow to extract expiration date from jwt
     *
     * @param token the jwt
     * @return {@code date} the jwt expiration date
     */
    public Date getExiprationDateFromToken(String token) {
        return getClaimFromToken(token, Claims::getExpiration);
    }

    /**
     * This method allow to generate user's token
     *
     * @param userDetails the user
     * @return {@code String}
     */
    public String generateToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();
        return doGenerateToken(claims, userDetails.getUsername());
    }

    /**
     * This method allow to validate token
     *
     * @param token       the jwt
     * @param userDetails the user
     * @return {@code Boolean} true or false
     */
    public Boolean validateToken(String token, UserDetails userDetails) {
        final String email = getEmailFromToken(token);
        return (email.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }

    private <T> T getClaimFromToken(String token, Function<Claims, T> claimResolver) {
        final Claims claims = getAllClaimsFromToken(token);
        return claimResolver.apply(claims);
    }

    private Claims getAllClaimsFromToken(String token) {
        return Jwts.parser().parseClaimsJws(token).getBody();
    }

    private Boolean isTokenExpired(String token) {
        final Date expiration = getExiprationDateFromToken(token);
        return expiration.before(new Date());
    }

    private String doGenerateToken(Map<String, Object> claims, String subject) {
        return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + Integer.getInteger(config.getExpiration()) * 1000))
                .signWith(SignatureAlgorithm.HS512, config.getJwtSecret()).compact();

    }


}
