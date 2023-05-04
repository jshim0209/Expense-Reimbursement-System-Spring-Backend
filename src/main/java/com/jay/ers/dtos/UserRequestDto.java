package com.jay.ers.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserRequestDto {

    private CredentialsDto credentials;

    private ProfileDto profile;

    private boolean isManager;

}
