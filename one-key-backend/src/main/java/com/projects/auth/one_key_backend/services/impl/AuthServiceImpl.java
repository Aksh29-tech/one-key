package com.projects.auth.one_key_backend.services.impl;

import com.projects.auth.one_key_backend.dtos.UserDto;
import com.projects.auth.one_key_backend.services.AuthService;
import com.projects.auth.one_key_backend.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserService userService;

    @Override
    public UserDto registerUser(UserDto userDto) {
        //logic
        //verify email
        //verify password
        //default roles
        UserDto userDto1 = userService.createUser(userDto);
        return userDto1;
    }
}
