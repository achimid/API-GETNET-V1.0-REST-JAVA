package br.com.achimid.sdk.getnet.ecommerce;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = false)
public class Order {

    @NotNull
    @NotEmpty
    @Size(max = 36)
    @SerializedName("order_id")
    private String orderId;

    @SerializedName("sales_tax")
    private BigDecimal salesTax;

    @SerializedName("product_type")
    private ProductTypeEnum productType;

}
