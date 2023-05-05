package com.jay.ers.mappers;

import com.jay.ers.dtos.StatusDto;
import com.jay.ers.entities.Status;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface StatusMapper {

    List<StatusDto> entitiesToDtos(List<Status> statuses);
}
