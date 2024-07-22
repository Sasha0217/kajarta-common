package com.kajarta.demo.utils;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtTokenUtil {
    private String secret = "2d6d6c4f0b73f9b18b3e6c17b7a0c6572f4c6e38dc95c64a94e2565e88d68d4d";
    private long expiration = 604800L; // Token有效期,单位为秒

    // 生成Token
    public String generateToken(Long customerId) {
        Map<String, Object> claims = new HashMap<>();
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(customerId.toString())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expiration * 1000))
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
    }
}
