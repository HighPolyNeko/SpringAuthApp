package ru.netology.springauthapp.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.springauthapp.exception.InvalidCredentials;
import ru.netology.springauthapp.exception.UnauthorizedUser;
import ru.netology.springauthapp.repository.Authorities;
import ru.netology.springauthapp.repository.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorizationService {
    UserRepository userRepository;

    public List<Authorities> getAuthorities(String user, String password) {
        if (isEmpty(user) || isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user, password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}
