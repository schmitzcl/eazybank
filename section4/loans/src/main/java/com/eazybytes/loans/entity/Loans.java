package com.eazybytes.loans.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Loans extends BaseEntity {

    @Column(name = "loan_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer loanId;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "loan_number")
    private String loanNumber;

    @Column(name = "loan_type")
    private String loanType;

    @Column(name = "total_loan")
    private Integer totalLoan;

    @Column(name = "amount_paid")
    private Integer amountPaid;

    @Column(name = "outstanding_amount")
    private Integer outstandingAmount;
}
