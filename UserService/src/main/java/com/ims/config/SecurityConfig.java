package com.ims.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .cors().and()  // Enable CORS
            .csrf().disable()  // Disable CSRF for testing
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/auth/**").permitAll()  // Allow unauthenticated access to /auth/register
                .anyRequest().authenticated()  // Require authentication for other endpoints
            )
            .httpBasic();  // Enable basic auth (if needed)

        return http.build();
    }
}
