package br.com.achimid.sdk.getnet.ecommerce;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@EqualsAndHashCode(callSuper = false)
public class Debit {

    @SerializedName("cardholder_mobile")
    private String cardholderMobile;

    @Size(max = 22)
    @SerializedName("soft_descriptor")
    private String softDescriptor;


    @SerializedName("dynamic_mcc")
    private Number dynamicMcc;

    @NotNull
    private Card card;

}
