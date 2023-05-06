package com.jay.ers.services;

import com.jay.ers.dtos.StatusDto;
import com.jay.ers.entities.Status;

import java.util.List;

public interface StatusService {

    List<StatusDto> getAllStatuses();

    Status findStatus(Long statusId);

    Status getStatusByStatus(String status);
}
