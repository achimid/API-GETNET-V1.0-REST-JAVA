package br.com.achimid.sdk.getnet.ecommerce.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Collection;

@Data
@EqualsAndHashCode(callSuper = false)
public class Plan {

    @NotNull
    @NotEmpty
    @Size(min = 36, max = 36)
    @SerializedName("seller_id")
    private String sellerId;

    @NotNull
    @NotEmpty
    @NotBlank
    private String name;

    private String description;

    @NotNull
    private Integer amount;

    @Size(min = 3, max = 3)
    private String currency;

    @NotNull
    @NotEmpty
    @SerializedName("payment_types")
    private Collection<String> paymentTypes;

    @SerializedName("sales_tax")
    private Integer salesTax = BigDecimal.ZERO.intValue();

    @SerializedName("product_type")
    private ProductTypeEnum productType;

    @NotNull
    private Period period;

}
