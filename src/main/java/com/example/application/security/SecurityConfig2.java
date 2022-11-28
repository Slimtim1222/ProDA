package com.example.application.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface SecurityConfig2 {
    @Bean
    UserDetailsService userDetailsService();
}
