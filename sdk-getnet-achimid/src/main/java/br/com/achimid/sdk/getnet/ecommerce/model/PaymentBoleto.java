package br.com.achimid.sdk.getnet.ecommerce.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

@Data
@EqualsAndHashCode(callSuper = false)
public class PaymentBoleto extends Payment {

    @NotNull
    private Boleto boleto;

}
