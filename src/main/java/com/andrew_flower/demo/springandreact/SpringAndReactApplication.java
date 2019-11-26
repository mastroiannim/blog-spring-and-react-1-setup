package com.andrew_flower.demo.springandreact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackageClasses=GreetingController.class) //https://stackoverflow.com/questions/36819277/issue-with-spring-there-was-an-unexpected-error-type-not-found-status-404
@ComponentScan(basePackages = {"com","hello"}) //https://dzone.com/articles/spring-component-scan
public class SpringAndReactApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAndReactApplication.class, args);
    }

}
