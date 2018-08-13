package br.com.achimid.sdk.getnet.ecommerce.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collection;

@Data
@EqualsAndHashCode(callSuper = true)
public class PaymentOnline extends Payment {

    private Device device;

    private Collection<Shipping> shippings;

}
