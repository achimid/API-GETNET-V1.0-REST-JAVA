package br.com.achimid.sdk.getnet.ecommerce;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@EqualsAndHashCode(callSuper = false)
public class Card extends CardToken {

    @Size(max = 50)
    private BrandEnum brand;

    @NotNull
    @NotEmpty
    @Size(max = 26)
    @SerializedName("cardholder_name")
    private String cardholderName;

    @NotNull
    @NotEmpty
    @Size(min = 2, max = 2)
    @SerializedName("expiration_month")
    private String expirationMonth;

    @NotNull
    @NotEmpty
    @Size(min = 2, max = 2)
    @SerializedName("expiration_year")
    private String expirationYear;


    @SerializedName("verify_card")
    private boolean verifyCard;

    @Size(min = 3, max = 4)
    @SerializedName("security_code")
    private String securityCode;


}
