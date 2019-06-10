package ru.itis.services;

import ru.itis.dto.SignUpForm;
import ru.itis.models.User;
import ru.itis.models.UserRole;
import ru.itis.repositories.UsersRepository;

import java.io.Reader;

public class UsersService {

    private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public User signUp(SignUpForm form) {
//        User.Builder myBuilder = new User.Builder();
        User user = User.builder()
                .password(form.getPassword())
                .login(form.getLogin())
                .role(UserRole.USER)
                .build();
        usersRepository.save(user);
        return user;
    }

    public void showAllUsers(){
        User[] users = usersRepository.findAll();
        for (int i = 0; i < users.length ; i++) {
            if (users[i] != null){
                users[i].toString();
            }
        }
    }

}
