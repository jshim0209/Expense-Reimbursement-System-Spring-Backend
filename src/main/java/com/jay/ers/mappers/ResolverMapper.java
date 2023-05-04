package com.jay.ers.mappers;

import com.jay.ers.dtos.ResolverDto;
import com.jay.ers.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResolverMapper {

    ResolverDto entityToResolverDto(User user);
}
