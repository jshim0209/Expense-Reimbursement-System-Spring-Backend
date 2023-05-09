package com.jay.ers.controllers;

import com.jay.ers.dtos.UserDto;
import com.jay.ers.dtos.UserRequestDto;
import com.jay.ers.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "${ui.url}", allowCredentials = "true")
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public UserDto createUser(@RequestBody UserRequestDto userRequestDto) {
        return userService.createUser(userRequestDto);
    }
}
