package com.luiz.dtime.Model.product;

import jakarta.validation.constraints.NotBlank;

public record NewProductDTO(
        @NotBlank
        String description
) {
}
