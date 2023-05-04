package com.jay.ers.controllers;

import com.jay.ers.dtos.CredentialsDto;
import com.jay.ers.dtos.UserDto;
import com.jay.ers.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "${ui.url}", allowCredentials = "true")
@RequestMapping("/authenticate")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/login")
    public UserDto login(@RequestBody CredentialsDto credentialsDto) {
        return authenticationService.login(credentialsDto);
    }
}
