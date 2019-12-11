package com.andrew_flower.demo.springandreact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan(basePackageClasses=GreetingController.class) //https://stackoverflow.com/questions/36819277/issue-with-spring-there-was-an-unexpected-error-type-not-found-status-404
@ComponentScan(basePackages = {"com","hello"}) //https://dzone.com/articles/spring-component-scan
@EnableJpaRepositories({"com.sanju.youtubedata.repository", "com.andrew_flower.demo.springandreact.repository"}) //https://stackoverflow.com/questions/40384056/consider-defining-a-bean-of-type-package-in-your-configuration-spring-boot
@EntityScan({"com.sanju.*","com.andrew_flower.*"}) //https://stackoverflow.com/questions/28664064/spring-boot-not-an-managed-type
public class SpringAndReactApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAndReactApplication.class, args);
    }

}
