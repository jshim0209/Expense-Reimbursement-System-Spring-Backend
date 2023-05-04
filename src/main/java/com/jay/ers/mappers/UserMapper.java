package com.jay.ers.mappers;

import com.jay.ers.dtos.UserDto;
import com.jay.ers.dtos.UserRequestDto;
import com.jay.ers.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = { ProfileMapper.class, CredentialsMapper.class})
public interface UserMapper {

    UserDto entityToDto(User user);

    User requestDtoToEntity(UserRequestDto userRequestDto);
}
