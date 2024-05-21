package com.luiz.dtime.Model.purchase;

import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.List;

public record NewPurchaseDTO(@NotNull Date date,
                             @NotNull double total,
                             @NotNull List<NewPurchaseItemDTO> items) {

}
