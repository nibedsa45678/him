package com.poc.him.policyservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter @Setter @NoArgsConstructor
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double coverage;
    private String category;
    private String policyDetails;
    private LocalDateTime policyUpdateDate;
    private long maxPersonCovered;
    private double basePremium;

    public Policy(String name, double coverage, String category, String policyDetails, LocalDateTime policyUpdateDate, long maxPersonCovered, double basePremium) {
        this.name = name;
        this.coverage = coverage;
        this.category = category;
        this.policyDetails = policyDetails;
        this.policyUpdateDate = policyUpdateDate;
        this.maxPersonCovered = maxPersonCovered;
        this.basePremium = basePremium;
    }
}