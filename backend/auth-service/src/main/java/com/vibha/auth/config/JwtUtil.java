package com.vibha.auth.config;

import io.jsonwebtoken.*;
import java.util.Date;

public class JwtUtil {

    private String secret = "vibha-secret-key";

    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 86400000))
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
    }
}