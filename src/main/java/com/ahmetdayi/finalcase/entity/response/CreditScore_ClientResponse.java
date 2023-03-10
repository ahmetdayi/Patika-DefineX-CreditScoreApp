package com.ahmetdayi.finalcase.entity.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditScore_ClientResponse {

    @NotNull
    private UUID id;
    @NotBlank
    private String nationalityId;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
}
