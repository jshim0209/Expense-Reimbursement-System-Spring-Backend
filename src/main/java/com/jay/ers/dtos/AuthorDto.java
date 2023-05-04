package com.jay.ers.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AuthorDto {

    private Long id;
    private ProfileDto profile;
}
