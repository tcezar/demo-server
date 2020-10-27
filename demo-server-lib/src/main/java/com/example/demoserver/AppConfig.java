package com.example.demoserver;

import org.example.config.DemoApiConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DemoApiConfig.class)
public class AppConfig {
}
