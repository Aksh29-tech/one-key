package com.projects.auth.one_key_backend.services;

import com.projects.auth.one_key_backend.dtos.UserDto;

public interface AuthService {
    UserDto registerUser(UserDto userDto);
}
