package com.jay.ers.services;

import com.jay.ers.dtos.CredentialsDto;
import com.jay.ers.dtos.UserDto;

public interface AuthenticationService {
    UserDto login(CredentialsDto credentialsDto);
}
