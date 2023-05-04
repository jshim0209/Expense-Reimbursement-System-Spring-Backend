package com.jay.ers.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserDto {

    private Long id;
    private ProfileDto profile;
    private boolean isManager;
}
