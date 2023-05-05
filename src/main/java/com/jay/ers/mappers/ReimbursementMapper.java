package com.jay.ers.mappers;

import com.jay.ers.dtos.ReimbursementDto;
import com.jay.ers.dtos.TypeDto;
import com.jay.ers.entities.Reimbursement;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring", uses = { UserMapper.class, TypeDto.class })

public interface ReimbursementMapper {
    List<ReimbursementDto> entitiesToDtos(List<Reimbursement> reimbursements);

    ReimbursementDto entityToDto(Reimbursement reimbursement);
}
