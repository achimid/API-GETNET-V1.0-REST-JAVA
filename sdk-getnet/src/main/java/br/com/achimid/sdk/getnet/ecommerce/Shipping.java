package br.com.achimid.sdk.getnet.ecommerce;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = false)
public class Shipping {

    @Size(max = 40)
    @SerializedName("first_name")
    private String firstName;

    @Size(max = 100)
    private String name;

    private String email;

    @Size(max = 15)
    @SerializedName("phone_number")
    private String phoneNumber;

    @SerializedName("shipping_amount")
    private BigDecimal shippingAmount;

    private Address address;

}
