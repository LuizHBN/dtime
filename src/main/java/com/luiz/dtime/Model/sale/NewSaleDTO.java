package com.luiz.dtime.Model.sale;

import com.luiz.dtime.Model.customer.Customer;

import java.util.Date;

public record NewSaleDTO(Date date,
                         Customer customer,
                         double totalValue
                         ) {
}
