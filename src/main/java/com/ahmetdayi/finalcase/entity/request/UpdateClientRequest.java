package com.ahmetdayi.finalcase.entity.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateClientRequest {

    @NotNull
    private UUID id;
    @NotBlank
    private String nationalityId;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotNull
    private double monthlySalary;
    @NotBlank
    private String phoneNumber;

    private LocalDate birthDay;
    @NotNull
    private double guarantee;
}
