package com.luiz.dtime.Model.customer;

import jakarta.validation.constraints.NotBlank;

public record NewCustomerDTO(
                                @NotBlank String name,
                                @NotBlank String about ) {
}
