package ru.dubovitsky.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import ru.dubovitsky.entity.Admin;
import ru.dubovitsky.repository.AdminRepository;

import java.util.Arrays;
import java.util.List;

@Component
public class ApplicationStartUp {

    @Autowired
    private StartupProperties startupProperties;

    @Bean
    public CommandLineRunner loadData(AdminRepository adminRepository) {
        return (args) -> {
            List<Admin> admins = adminRepository.findAll();

            if (ObjectUtils.isEmpty(admins)) {
                adminRepository.save(new Admin(
                        startupProperties.getUsername(),
                        BCrypt.hashpw(startupProperties.getPassword(), BCrypt.gensalt()),
                        startupProperties.getEmailAddress(),
                        startupProperties.getStatus(),
                        startupProperties.getLoginAttempt(),
                        Arrays.asList("ADMIN")));
            }
        };
    }
}
