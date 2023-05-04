package com.jay.ers.mappers;

import com.jay.ers.dtos.ProfileDto;
import com.jay.ers.entities.Profile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper {

    Profile dtoToEntity(ProfileDto profileDto);

    ProfileDto entityToDto(Profile profile);

}
