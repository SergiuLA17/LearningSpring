package com.example.learningspring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.learningspring")
@PropertySource("classpath:application.properties")
public class SpringConfig {
}
