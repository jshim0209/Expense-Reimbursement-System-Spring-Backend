package com.jay.ers.services.impl;

import com.jay.ers.dtos.StatusDto;
import com.jay.ers.entities.Status;
import com.jay.ers.exceptions.NotFoundException;
import com.jay.ers.mappers.StatusMapper;
import com.jay.ers.repositories.StatusRepository;
import com.jay.ers.services.StatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Status findStatus(Long statusId) {
        Optional<Status> status = statusRepository.findById(statusId);

        if (status.isEmpty()) {
            throw new NotFoundException("Status with the id of " + statusId + " does not exist.");
        }
        return status.get();
    }

    @Override
    public Status getStatusByStatus(String status) {
        Optional<Status> statusOptional = statusRepository.findByStatus(status);

        if (statusOptional.isEmpty()) {
            throw new NotFoundException("Our list of statuses does not have " + status);
        }
        return statusOptional.get();
    }
}
