package com.soulcode.goserviceapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final String[] PUBLIC_ROUTES = {"/", "/home", "/auth/**", "/css/**", "/js/**", "/assets/**"};

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .requestMatchers(PUBLIC_ROUTES)
                .permitAll()
                .requestMatchers("/admin/**").hasRole("ADMIN")
                .requestMatchers("/prestador/**").hasRole("PRESTADOR")
                .requestMatchers("/cliente/**").hasRole("CLIENTE")
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/auth/login")
                .defaultSuccessUrl("/");
        return http.build();
    }
}
