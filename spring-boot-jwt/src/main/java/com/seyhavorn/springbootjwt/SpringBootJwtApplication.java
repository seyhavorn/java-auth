package com.seyhavorn.springbootjwt;

import com.seyhavorn.springbootjwt.domain.Role;
import com.seyhavorn.springbootjwt.domain.User;
import com.seyhavorn.springbootjwt.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class SpringBootJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJwtApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_MANAGER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));
            userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

            userService.saveUser(new User(null, "Seyha Vorn", "seyhavorn", " 1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Cheat la", "cheatla", " 1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Bopha Bii", "bophabii", " 1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Channa Bii", "channabii", " 1234", new ArrayList<>()));

            userService.addRoleToUser("seyhavorn", "ROLE_USER");
            userService.addRoleToUser("seyhavorn", "ROLE_MANAGER");
            userService.addRoleToUser("seyhavorn", "ROLE_ADMIN");
            userService.addRoleToUser("seyhavorn", "ROLE_SUPER_ADMIN");

            userService.addRoleToUser("cheatla", "ROLE_MANAGER");
            userService.addRoleToUser("bophabii", "ROLE_ADMIN");
            userService.addRoleToUser("channabii", "ROLE_SUPER_ADMIN");
        };
    }
}
