package com.jay.ers.dtos;

import com.jay.ers.entities.Status;
import com.jay.ers.entities.Type;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ReimbursementDto {

    private int id;
    private double amount;
    private String timeSubmitted;
    private String timeResolved;
    private String description;
    private String receipt;
    private AuthorDto author;
    private ResolverDto resolver;
    private Status status;
    private Type type;
}
