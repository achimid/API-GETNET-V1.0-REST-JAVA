package br.com.achimid.sdk.getnet.ecommerce.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Size;

@Data
@EqualsAndHashCode(callSuper = false)
public class Address {

    @Size(max = 60)
    private String street;

    @Size(max = 10)
    private String number;

    @Size(max = 60)
    private String complement;

    @Size(max = 40)
    private String district;

    @Size(max = 40)
    private String city;

    @Size(max = 20)
    private String state;

    @Size(max = 20)
    private String country;

    @Size(max = 8)
    @SerializedName("postal_code")
    private String postalCode;

}
