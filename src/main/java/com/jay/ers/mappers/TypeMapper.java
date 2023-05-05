package com.jay.ers.mappers;

import com.jay.ers.dtos.TypeDto;
import com.jay.ers.entities.Type;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface TypeMapper {

    List<TypeDto> entitiesToDtos(List<Type> types);

}
