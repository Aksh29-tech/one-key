package com.projects.auth.one_key_backend.config;

import jakarta.persistence.Column;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
