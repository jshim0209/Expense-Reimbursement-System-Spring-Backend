package com.jay.ers.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "reimbursements")
@NoArgsConstructor
@Data
public class Reimbursement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private double amount;

    @Column
    private LocalDate timeSubmitted;

    @Column
    private LocalDate timeResolved;

    @Column
    private String description;

    @Column
    private String receipt;

    @ManyToOne
    private User author;

    @OneToOne
    private User resolver;

    @OneToOne
    private Status status;

    @OneToOne
    private Type type;
}
