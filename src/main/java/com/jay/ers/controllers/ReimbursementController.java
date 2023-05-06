package com.jay.ers.controllers;

import com.jay.ers.dtos.ReimbursementDto;
import com.jay.ers.dtos.ReimbursementRequestDto;
import com.jay.ers.services.ReimbursementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "${ui.url}", allowCredentials = "true")
@RequestMapping("/reimbursements")
@RequiredArgsConstructor
public class ReimbursementController {
    private final ReimbursementService reimbursementService;

    @GetMapping
    public List<ReimbursementDto> getAllReimbursements(@RequestParam Optional<Long> statusId,
                                                       @RequestParam Optional<Long> typeId) {
        if (statusId.isPresent() && typeId.isPresent()) {
            return reimbursementService.getAllReimbursementsByStatusAndType(statusId, typeId);
        }
        if (statusId.isPresent()) {
            return reimbursementService.getAllReimbursementsByStatus(statusId);
        }
        if (typeId.isPresent()) {
            return reimbursementService.getAllReimbursementsByType(typeId);
        }
        return reimbursementService.getAllReimbursements();
    }

    @GetMapping("/{userId}")
    public List<ReimbursementDto> getReimbursementsByUserId(@PathVariable Long userId,
                                                            @RequestParam Optional<Long> statusId,
                                                            @RequestParam Optional<Long> typeId) {
        if (statusId.isPresent() && typeId.isPresent()) {
            return reimbursementService.getAllReimbursementsForUserByStatusAndType(userId, statusId, typeId);
        }
        if (statusId.isPresent()) {
            return reimbursementService.getReimbursementsForUserByStatus(userId, statusId);
        }
        if (typeId.isPresent()) {
            return reimbursementService.getAllReimbursementsForUserByType(userId, typeId);
        }
        return reimbursementService.getReimbursementsByUserId(userId);
    }

    @PostMapping("/{userId}")
    public ReimbursementDto addReimbursement(@PathVariable Long userId,
                                             @RequestBody ReimbursementRequestDto reimbursementRequestDto) {
        return reimbursementService.addReimbursement(userId, reimbursementRequestDto);
    }

    @PatchMapping("/{reimbursementId}/status/{statusId}/resolver/{resolverId}")
    public ReimbursementDto updateReimbursementStatus(@PathVariable Long reimbursementId,
                                                      @PathVariable Long statusId,
                                                      @PathVariable Long resolverId) {
        return reimbursementService.updateReimbursementStatus(reimbursementId, statusId, resolverId);
    }
}
