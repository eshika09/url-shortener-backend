package com.example.url_shortener.demo.Security.Jwt;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//this is a dto class representing the authentication response
@AllArgsConstructor
public class JwtAuthenticationResponse {
    private String token;
}
