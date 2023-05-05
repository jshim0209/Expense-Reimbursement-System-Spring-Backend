package com.jay.ers.services;

import com.jay.ers.entities.User;

public interface UserService {

    User getUserById(Long id);

    User getUserByUsername(String username);
}
