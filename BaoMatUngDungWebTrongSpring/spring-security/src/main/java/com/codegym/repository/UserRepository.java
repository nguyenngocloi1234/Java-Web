package com.codegym.repository;

import com.codegym.entity.UserEntity;

public interface UserRepository {
    UserEntity findByName(String name);
}
