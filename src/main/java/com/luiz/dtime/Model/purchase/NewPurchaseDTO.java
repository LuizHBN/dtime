package com.luiz.dtime.Model.purchase;

import java.util.Date;
import java.util.List;

public record NewPurchaseDTO(Date date,
                             double total,
                             List<NewPurchaseItemDTO> itens) {

}
