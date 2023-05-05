package com.jay.ers.dtos;

import com.jay.ers.entities.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ReimbursementRequestDto {
    private double amount;
    private String description;
    private String receipt;
    private Status status = new Status(1L, "Pending");
    private String type;
}
