package com.ahmetdayi.finalcase.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Credit {
    //kullanıcıya verılemsı dusunen kredı lımıtının ve onay durumunun tutuldugu sınıf

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private double creditLimit;

    @Enumerated(EnumType.STRING)
    private CreditResult creditResult;

    @ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    @JoinColumn
    private Client client;

    public Credit(double creditLimit, CreditResult creditResult, Client client) {
        this.creditLimit = creditLimit;
        this.creditResult = creditResult;
        this.client = client;
    }
}
