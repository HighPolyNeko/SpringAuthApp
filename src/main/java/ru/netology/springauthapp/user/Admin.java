package ru.netology.springauthapp.user;

import ru.netology.springauthapp.repository.Authorities;

import java.util.List;

public class Admin extends User {
    public Admin(String user, String pass, List<Authorities> authorities) {
        super(user, pass, authorities);
    }
}
