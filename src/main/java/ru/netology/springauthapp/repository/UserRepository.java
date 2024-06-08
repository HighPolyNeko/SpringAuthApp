package ru.netology.springauthapp.repository;

import org.springframework.stereotype.Repository;
import ru.netology.springauthapp.user.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {
    private final Map<String, User> users;

    public UserRepository() {
        users = new HashMap<>();
    }

    public void addUser(User user) {
        users.put(user.getUser(), user);
    }

    public List<Authorities> getUserAuthorities(String user, String password) {

        // todo: temp
        ArrayList<Authorities> authorities = new ArrayList<>();
        authorities.add(Authorities.READ);
        return authorities;


//        if (!users.containsKey(user)) {
//            return null;
//        }
//        if (users.get(user).getPass().equals(password)) {
//            return users.get(user).getAuthorities();
//        }
//        return null;
    }
}