package br.com.achimid.sdk.getnet.ecommerce.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@EqualsAndHashCode(callSuper = false)
public class Cancelattion {

    @NotNull
    @NotEmpty
    @Size(min = 36, max = 36)
    @SerializedName("payment_id")
    private String paymentId;

    @SerializedName("cancel_amount")
    private Integer cancelAmount;

    @Size(min = 32, max = 32)
    @SerializedName("cancel_custom_key")
    private String cancelCustomKey;



}
