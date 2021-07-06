package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(10);
        u1.setName("John");
        u1.setAccount("john");
        u1.setEmail("john@gmail.com");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User("bill","123456","Bill","bill@gmail.com",16);
        users.add(u2);

        User u3 = new User("mike","123456","Mike","mike@gmail.com",15);
        users.add(u3);
    }

    public static User checkLogin(Login login){
        for(User user:users){
            if (user.getAccount().equals(login.getAccount())&& user.getPassword().equals(login.getPassword())){
                return user;
            }
        }
        return null;
    }
}
