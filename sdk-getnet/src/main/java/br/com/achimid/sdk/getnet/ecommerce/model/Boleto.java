package br.com.achimid.sdk.getnet.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Size;
import java.util.Calendar;

@Data
@EqualsAndHashCode(callSuper = false)
public class Boleto {

    @Size(min = 12, max = 12)
    @SerializedName("our_number")
    private String ourNumber;

    @Size(max = 15, min = 15)
    @SerializedName("document_number")
    private String documentNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @SerializedName("expiration_date")
    private Calendar expirationDate;

    private String instructions;

    @Size(max = 40)
    private String provider = "santander";

}
