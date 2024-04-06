package com.luiz.dtime.Model.debtor;

import com.luiz.dtime.Model.customer.Customer;
import com.luiz.dtime.Model.purchase.Purchase;
import com.luiz.dtime.Model.sale.Sale;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record NewDebtorDTO(@NotNull Purchase purchase,
                           @NotNull Customer customer,
                           @NotNull Sale sale,
                           @NotNull Date payday_1,
                           @NotNull Date payday_2,
                           @NotNull double totalValue,
                           @NotNull double remainingValue){
}
