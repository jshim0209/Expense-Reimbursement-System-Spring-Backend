package com.jay.ers.services.impl;

import com.jay.ers.entities.User;
import com.jay.ers.exceptions.NotFoundException;
import com.jay.ers.repositories.UserRepository;
import com.jay.ers.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()) {
            throw new NotFoundException("The user with user id of " + id + " does not exist.");
        }
        return user.get();
    }

    @Override
    public User getUserByUsername(String username) {
        Optional<User> user = userRepository.findByCredentialsUsername(username);
        if (user.isEmpty()) {
            throw new NotFoundException("The username provided does not belong any user.");
        }
        return user.get();
    }
}
