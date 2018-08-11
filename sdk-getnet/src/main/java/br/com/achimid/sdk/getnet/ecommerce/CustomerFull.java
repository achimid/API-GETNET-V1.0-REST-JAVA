package br.com.achimid.sdk.getnet.ecommerce;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerFull extends Customer {

    @NotNull
    @NotEmpty
    @Size(min = 36, max = 36)
    @SerializedName("seller_id")
    private String sellerId;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @SerializedName("birth_date")
    private String birthDate;


}
