package com.example.migration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MigrationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MigrationApplication.class, args);
        ExampleService bean = run.getBean(ExampleService.class);
        System.out.println("1111111");
        bean.createUser();
    }

}
