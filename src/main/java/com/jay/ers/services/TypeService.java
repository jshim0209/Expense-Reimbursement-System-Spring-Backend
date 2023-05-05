package com.jay.ers.services;

import com.jay.ers.dtos.TypeDto;
import com.jay.ers.entities.Type;

import java.util.List;

public interface TypeService {

    Type findType(String type);

    List<TypeDto> getAllTypes();
}
