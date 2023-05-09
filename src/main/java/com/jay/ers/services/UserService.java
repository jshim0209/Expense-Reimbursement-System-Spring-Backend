package com.jay.ers.services;

import com.jay.ers.dtos.UserDto;
import com.jay.ers.dtos.UserRequestDto;
import com.jay.ers.entities.User;

public interface UserService {

    User getUserById(Long id);

    User getUserByUsername(String username);

    UserDto createUser(UserRequestDto userRequestDto);
}
