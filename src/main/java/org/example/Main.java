package org.example;

import org.example.models.User;
import org.example.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        UserRepository userRepository = context.getBean(UserRepository.class);
        User user = new User("Andrey", "Sol", "avs", "123");
        userRepository.save(user);
        //userRepository.deleteById(2L);
        context.close();
    }
}