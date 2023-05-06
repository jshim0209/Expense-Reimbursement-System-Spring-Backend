package com.jay.ers.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ReimbursementRequestDto {
    private double amount;
    private String description;
    private String receipt;
    private TypeDto type;
}
