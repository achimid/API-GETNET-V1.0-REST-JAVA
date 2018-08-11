package br.com.achimid.sdk.getnet.ecommerce;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collection;

@Data
@EqualsAndHashCode(callSuper = true)
public class PaymentOnline extends Payment {

    private Device device;

    private Collection<Shipping> shippings;

}
