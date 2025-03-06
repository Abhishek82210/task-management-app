package com.example.tast_management_system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {  // Method name should start with lowercase
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**") // Allow API calls
                        .allowedOrigins("http://127.0.0.1:5500", "http://localhost:3000") // Allow frontend (Live Server & React)
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .allowedHeaders("*") // Allow all headers
                        .allowCredentials(true);
            }
        };
    }
}
