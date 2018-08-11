package br.com.achimid.sdk.getnet.ecommerce;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

@Data
@EqualsAndHashCode(callSuper = true)
public class PaymentDebit extends PaymentOnline {

    @NotNull
    private Debit debit;

}
