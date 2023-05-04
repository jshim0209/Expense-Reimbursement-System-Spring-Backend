package com.jay.ers.controllers;

import com.jay.ers.dtos.ReimbursementDto;
import com.jay.ers.services.ReimbursementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "${ui.url}", allowCredentials = "true")
@RequestMapping("/reimbursements")
@RequiredArgsConstructor
public class ReimbursementController {
    private final ReimbursementService reimbursementService;

    @GetMapping
    public List<ReimbursementDto> getAllReimbursements(@RequestParam(required = false) String status) {
        if (status != null) {
            return reimbursementService.getAllReimbursementsByStatus(status);
        }
        return reimbursementService.getAllReimbursements();
    }
}
