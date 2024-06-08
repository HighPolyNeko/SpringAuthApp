package ru.netology.springauthapp.user;

import ru.netology.springauthapp.repository.Authorities;

import java.util.List;

public class Guest extends User {

    public Guest(String user, String pass, List<Authorities> authorities) {
        super(user, pass, authorities);
    }
}
