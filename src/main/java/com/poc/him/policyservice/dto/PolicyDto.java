package com.poc.him.policyservice.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter @Setter @NoArgsConstructor
public class PolicyDto implements Serializable {
    private String name;
    private double coverage;
    private String category;
    private String policyDetails;
    private LocalDateTime policyUpdateDate;
    private long maxPersonCovered;
    private double basePremium;

    public PolicyDto(String name, double coverage, String category, String policyDetails, LocalDateTime policyUpdateDate, long maxPersonCovered, double basePremium) {
        this.name = name;
        this.coverage = coverage;
        this.category = category;
        this.policyDetails = policyDetails;
        this.policyUpdateDate = policyUpdateDate;
        this.maxPersonCovered = maxPersonCovered;
        this.basePremium = basePremium;
    }
}
