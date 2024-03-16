package com.gestion.App;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main class of the Spring Boot Restful Api.
 *
 * @author <ILYAS ABBAL>
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.gestion")
public class AppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }
}
