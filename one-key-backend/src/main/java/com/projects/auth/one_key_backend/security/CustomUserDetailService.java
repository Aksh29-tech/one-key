package com.projects.auth.one_key_backend.security;

import com.projects.auth.one_key_backend.entities.User;
import com.projects.auth.one_key_backend.exceptions.ResourceNotFoundException;
import com.projects.auth.one_key_backend.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository
                .findByEmail(username)
                .orElseThrow(() -> new ResourceNotFoundException("Invalid Email or Password"));
        return user;
    }
}
