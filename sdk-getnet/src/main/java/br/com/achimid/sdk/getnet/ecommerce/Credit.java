package br.com.achimid.sdk.getnet.ecommerce;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = false)
public class Credit {

    @NotNull
    private boolean delayed;

    private boolean authenticated;

    @SerializedName("pre_authorization")
    private boolean preAuthorization;

    @NotNull
    @SerializedName("save_card_data")
    private boolean saveCardData;

    @NotNull
    @SerializedName("transaction_type")
    private TransactionType transactionType;

    @NotNull
    @SerializedName("number_installments")
    private BigDecimal numberInstallments;

    @Size(max = 22)
    @SerializedName("soft_descriptor")
    private String softDescriptor;

    @SerializedName("dynamic_mcc")
    private Number dynamicMcc;

    @NotNull
    private Card card;
}
