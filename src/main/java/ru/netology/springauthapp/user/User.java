package ru.netology.springauthapp.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.netology.springauthapp.repository.Authorities;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public abstract class User {
    protected String user;
    protected String pass;
    protected List<Authorities> authorities;
}
