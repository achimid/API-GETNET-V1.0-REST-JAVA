package br.com.achimid.sdk.getnet.ecommerce;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotEmpty;
import sun.util.resources.CurrencyNames;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Currency;

@Data
@EqualsAndHashCode(callSuper = false)
public abstract class Payment {

    @NotNull
    @NotEmpty
    @Size(min = 36, max = 36)
    @SerializedName("seller_id")
    private String sellerId;

    @NotNull
    private Integer amount;

    @Size(min = 3, max = 3)
    private String currency;

    @NotNull
    private Order order;

    @NotNull
    private Customer customer;


}
