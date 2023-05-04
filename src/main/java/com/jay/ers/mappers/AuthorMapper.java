package com.jay.ers.mappers;

import com.jay.ers.dtos.AuthorDto;
import com.jay.ers.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthorMapper {

    AuthorDto entityToAuthorDto(User user);
}
