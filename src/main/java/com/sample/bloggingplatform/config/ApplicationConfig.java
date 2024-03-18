package com.sample.bloggingplatform.config;

import org.jetbrains.annotations.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
public class ApplicationConfig {

    @Contract(" -> new")
    @org.jetbrains.annotations.NotNull
    @Bean
    protected static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}