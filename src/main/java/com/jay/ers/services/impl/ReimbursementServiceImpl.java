package com.jay.ers.services.impl;

import com.jay.ers.dtos.ReimbursementDto;
import com.jay.ers.dtos.ReimbursementRequestDto;
import com.jay.ers.entities.Reimbursement;
import com.jay.ers.entities.Status;
import com.jay.ers.entities.Type;
import com.jay.ers.entities.User;
import com.jay.ers.exceptions.NotFoundException;
import com.jay.ers.mappers.ReimbursementMapper;
import com.jay.ers.repositories.ReimbursementRepository;
import com.jay.ers.services.ReimbursementService;
import com.jay.ers.services.StatusService;
import com.jay.ers.services.TypeService;
import com.jay.ers.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReimbursementServiceImpl implements ReimbursementService {
    private final ReimbursementRepository reimbursementRepository;
    private final ReimbursementMapper reimbursementMapper;
    private final UserService userService;
    private final TypeService typeService;
    private final StatusService statusService;

    private Reimbursement findReimbursement(Long reimbursementId) {
        Optional<Reimbursement> reimbursement = reimbursementRepository.findById(reimbursementId);

        if (reimbursement.isEmpty()) {
            throw new NotFoundException("Reimbursement with the id of " + reimbursementId + " does not exist.");
        }
        return reimbursement.get();
    }
    @Override
    public List<ReimbursementDto> getAllReimbursementsByStatus(Optional<Long> statusId) {
        List<Reimbursement> reimbursements = reimbursementRepository.findAllByStatusId(statusId);
        return reimbursementMapper.entitiesToDtos(reimbursements);
    }

    @Override
    public List<ReimbursementDto> getAllReimbursements() {
        List<Reimbursement> reimbursements = reimbursementRepository.findAll();
        return reimbursementMapper.entitiesToDtos(reimbursements);
    }

    @Override
    public List<ReimbursementDto> getReimbursementsByUserId(Long userId) {
        List<Reimbursement> reimbursements = reimbursementRepository.findAllByAuthorId(userId);
        return reimbursementMapper.entitiesToDtos(reimbursements);
    }

    @Override
    public List<ReimbursementDto> getReimbursementsForUserByStatus(Long userId, Optional<Long> statusId) {
        List<Reimbursement> reimbursements = reimbursementRepository.findAllByAuthorIdAndStatusId(userId, statusId);
        return reimbursementMapper.entitiesToDtos(reimbursements);
    }

    @Override
    public ReimbursementDto addReimbursement(Long userId, ReimbursementRequestDto reimbursementRequestDto) {
        Status defaultStatus = statusService.getStatusByStatus("Pending");
        Reimbursement reimbursement = reimbursementMapper.dtoToEntity(reimbursementRequestDto);
        reimbursement.setAuthor(userService.getUserById(userId));
        reimbursement.setTimeSubmitted(LocalDate.now());
        reimbursement.setStatus(defaultStatus);

        return reimbursementMapper.entityToDto(reimbursementRepository.saveAndFlush(reimbursement));
    }

    @Override
    public List<ReimbursementDto> getAllReimbursementsByType(Optional<Long> typeId) {
        List<Reimbursement> reimbursements = reimbursementRepository.findAllByTypeId(typeId);
        return reimbursementMapper.entitiesToDtos(reimbursements);
    }

    @Override
    public List<ReimbursementDto> getAllReimbursementsByStatusAndType(Optional<Long> statusId, Optional<Long> typeId) {
        List<Reimbursement> reimbursements = reimbursementRepository.findAllByStatusIdAndTypeId(statusId, typeId);
        return reimbursementMapper.entitiesToDtos(reimbursements);
    }

    @Override
    public List<ReimbursementDto> getAllReimbursementsForUserByType(Long userId, Optional<Long> typeId) {
        List<Reimbursement> reimbursements = reimbursementRepository.findAllByAuthorIdAndTypeId(userId, typeId);
        return reimbursementMapper.entitiesToDtos(reimbursements);
    }

    @Override
    public List<ReimbursementDto> getAllReimbursementsForUserByStatusAndType(Long userId, Optional<Long> statusId, Optional<Long> typeId) {
        List<Reimbursement> reimbursements = reimbursementRepository.findAllByAuthorIdAndStatusIdAndTypeId(userId, statusId, typeId);
        return reimbursementMapper.entitiesToDtos(reimbursements);
    }

    @Override
    public ReimbursementDto updateReimbursementStatus(Long reimbursementId, Long statusId, Long resolverId) {
        Reimbursement reimbursement = findReimbursement(reimbursementId);
        User resolver = userService.getUserById(resolverId);
        Status newStatus = statusService.findStatus(statusId);
        reimbursement.setStatus(newStatus);
        reimbursement.setResolver(resolver);
        reimbursement.setTimeResolved(LocalDate.now());
        return reimbursementMapper.entityToDto(reimbursementRepository.saveAndFlush(reimbursement));
    }


}
