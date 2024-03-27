package com.luiz.dtime.Model.purchase;

import org.springframework.data.domain.Page;

import java.util.Date;


public record ReadPurchaseAndItensDTO(Purchase purchase,
                                      Date date,
                                      double total,
                                      boolean delivered,
                                      Page<ReadPurchaseItemDTO> items

                                      ) {


}
