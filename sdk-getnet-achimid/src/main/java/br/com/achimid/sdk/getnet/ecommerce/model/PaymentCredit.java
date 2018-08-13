package br.com.achimid.sdk.getnet.ecommerce.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

@Data
@EqualsAndHashCode(callSuper = true)
public class PaymentCredit extends PaymentOnline {

    @NotNull
    private Credit credit;

}
