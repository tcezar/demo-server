package org.example.config;

import org.example.api.IDemoApi;
import org.example.impl.DemoApiImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
public class DemoApiConfig {

    private static Logger log = Logger.getLogger(DemoApiConfig.class.getName());
    static {
        System.out.println("org.example.config.DemoApiConfig init;");
        log.info("org.example.config.DemoApiConfig init;");
    }
    @Bean
    public IDemoApi iDemoApi(){
        return new DemoApiImpl("samoParameter");
    }
}
