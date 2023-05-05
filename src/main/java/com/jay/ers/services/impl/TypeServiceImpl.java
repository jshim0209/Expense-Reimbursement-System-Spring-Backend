package com.jay.ers.services.impl;

import com.jay.ers.dtos.TypeDto;
import com.jay.ers.entities.Type;
import com.jay.ers.mappers.TypeMapper;
import com.jay.ers.repositories.TypeRepository;
import com.jay.ers.services.TypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TypeServiceImpl implements TypeService {

    private final TypeRepository typeRepository;
    private final TypeMapper typeMapper;

    @Override
    public Type findType(String type) {

        return typeRepository.findByType(type);
    }

    @Override
    public List<TypeDto> getAllTypes() {
        return typeMapper.entitiesToDtos(typeRepository.findAll());
    }
}
