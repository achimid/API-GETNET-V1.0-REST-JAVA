package br.com.achimid.sdk.getnet.ecommerce.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@EqualsAndHashCode(callSuper = false)
public class Customer {

    @NotNull
    @NotEmpty
    @Size(max = 100)
    @SerializedName("customer_id")
    private String customerId;

    @Size(max = 40)
    @SerializedName("first_name")
    private String firstName;

    @Size(max = 80)
    @SerializedName("last_name")
    private String lastName;

    @Size(max = 100)
    private String name;

    private String email;

    @Size(min = 11, max = 15)
    @SerializedName("document_type")
    private String documentType;

    @Size(max = 15)
    @SerializedName("document_number")
    private String documentNumber;

    @SerializedName("phone_number")
    private String phoneNumber;

    @NotNull
    @SerializedName("billing_address")
    private Address billingAddress;

}
