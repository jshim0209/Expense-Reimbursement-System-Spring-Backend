package com.jay.ers.services.impl;

import com.jay.ers.dtos.CredentialsDto;
import com.jay.ers.dtos.UserDto;
import com.jay.ers.entities.Credentials;
import com.jay.ers.entities.User;
import com.jay.ers.exceptions.BadRequestException;
import com.jay.ers.exceptions.NotAuthorizedException;
import com.jay.ers.exceptions.UserNotExistException;
import com.jay.ers.mappers.CredentialsMapper;
import com.jay.ers.mappers.UserMapper;
import com.jay.ers.repositories.UserRepository;
import com.jay.ers.services.AuthenticationService;
import com.jay.ers.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;
    private final UserMapper userMapper;
    private final CredentialsMapper credentialsMapper;


    @Override
    public UserDto login(CredentialsDto credentialsDto) {
        if (credentialsDto == null || credentialsDto.getUsername() == null || credentialsDto.getPassword() == null) {
            throw new BadRequestException("A username and password are required.");
        }
        Credentials credentialsToValidate = credentialsMapper.dtoToEntity(credentialsDto);
        User userToValidate = userService.getUserByUsername(credentialsDto.getUsername());
        if (!userToValidate.getCredentials().equals(credentialsToValidate)) {
            throw new NotAuthorizedException("The provided credentials are invalid.");
        }

        return userMapper.entityToDto(userToValidate);
    }
}
