package ru.netology.springauthapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springauthapp.controller.AuthorizationController;
import ru.netology.springauthapp.repository.UserRepository;
import ru.netology.springauthapp.service.AuthorizationService;

@Configuration
public class JavaConfig {
    @Bean
    public AuthorizationController authorizationController(AuthorizationService service){
        return new AuthorizationController(service);
    }

    @Bean
    public AuthorizationService authorizationService(UserRepository repository){
        return new AuthorizationService(repository);
    }

    @Bean
    public UserRepository userRepository(){
        return new UserRepository();
    }
}
