package com.codegym.repository.impl;

import com.codegym.entity.UserEntity;
import com.codegym.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private List<UserEntity> entities = new ArrayList<>();

    {
        entities.add(new UserEntity("user", "$2a$10$S..LxXNw95RtqvTP1E6yPOOb0yi7dzrc6U2fjpLus8OlrRf685hfC", "ROLE_USER"));
        entities.add(new UserEntity("admin", "$2a$10$S..LxXNw95RtqvTP1E6yPOOb0yi7dzrc6U2fjpLus8OlrRf685hfC", "ROLE_ADMIN"));
    }
    @Override
    public UserEntity findByName(String name) {
        return entities.stream().filter(e->name.equals(e.getUsername())).findFirst().orElse(null);
    }
}
