package com.luiz.dtime.Model.sale;

import com.luiz.dtime.Model.customer.Customer;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.List;

public record NewSaleDTO(@NotNull Date date,
                         @NotNull Customer customer,
                         @NotNull double totalValue,
                         @NotNull List<NewSaleItemDTO> items
                         ) {
}
