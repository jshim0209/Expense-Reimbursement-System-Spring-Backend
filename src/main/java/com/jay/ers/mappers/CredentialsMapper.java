package com.jay.ers.mappers;

import com.jay.ers.dtos.CredentialsDto;
import com.jay.ers.entities.Credentials;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface CredentialsMapper {
    Credentials dtoToEntity(CredentialsDto credentialsDto);

}
