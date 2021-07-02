package com.squad8.spyro;

import com.squad8.spyro.service.MessagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(scanBasePackages = "com.squad8.spyro")
public class SPyroApplication implements CommandLineRunner {

    //@Autowired
    //private MessagingService messagingService;

    public static void main(String[] args) {
        SpringApplication.run(SPyroApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        final String topic = "roytuts/topic/event";

        //messagingService.subscribe(topic);

        //messagingService.publish(topic, "Hola, este es un mensaje del topic:" + topic, 0, true);

        //context.close();
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE")
                        .allowedHeaders("*")
                        .allowedOrigins("*")
                        .allowCredentials(true);
            }
        };
    }

}