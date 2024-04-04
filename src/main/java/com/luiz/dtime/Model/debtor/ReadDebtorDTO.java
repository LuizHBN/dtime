package com.luiz.dtime.Model.debtor;

import com.luiz.dtime.Model.customer.Customer;
import com.luiz.dtime.Model.purchase.Purchase;
import com.luiz.dtime.Model.sale.Sale;

import java.util.Date;

public record ReadDebtorDTO(Purchase purchase,
                            Customer customer,
                            Sale sale,
                            Date payday_1,
                            Date payday_2,
                            double totalValue,
                            double remainingValue) {

    public ReadDebtorDTO(Debtor debtor){
        this(debtor.getPurchase(),
                debtor.getCustomer(),
                debtor.getSale(),
                debtor.getPayday_1(),
                debtor.getPayday_2(),
                debtor.getTotalValue(),
                debtor.getRemainingValue());
    }
}
