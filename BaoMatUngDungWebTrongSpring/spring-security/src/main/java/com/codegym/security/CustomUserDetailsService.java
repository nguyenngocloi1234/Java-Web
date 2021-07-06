package com.codegym.security;

import com.codegym.entity.UserEntity;
import com.codegym.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Arrays;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findByName(username);
        if (userEntity == null) {
            throw new UsernameNotFoundException(username);
        } else {
            return new User(userEntity.getUsername(), userEntity.getPassword(), Arrays.asList(new SimpleGrantedAuthority(userEntity.getRole())));
        }
    }
}