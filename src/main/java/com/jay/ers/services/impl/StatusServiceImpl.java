package com.jay.ers.services.impl;

import com.jay.ers.dtos.StatusDto;
import com.jay.ers.entities.Status;
import com.jay.ers.mappers.StatusMapper;
import com.jay.ers.repositories.StatusRepository;
import com.jay.ers.services.StatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class StatusServiceImpl implements StatusService {
    private final StatusRepository statusRepository;
    private final StatusMapper statusMapper;
    @Override
    public List<StatusDto> getAllStatuses() {
        List<Status> statuses = statusRepository.findAll();
        return statusMapper.entitiesToDtos(statuses);
    }
}
