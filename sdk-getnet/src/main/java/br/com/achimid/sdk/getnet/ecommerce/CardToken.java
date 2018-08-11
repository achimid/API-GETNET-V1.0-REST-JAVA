package br.com.achimid.sdk.getnet.ecommerce;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@EqualsAndHashCode(callSuper = false)
public class CardToken {

    @Size(max = 128, min = 128, message = "O token deve ter 128 caracteres")
    @NotEmpty(message = "O token nao pode ser vazio")
    @NotNull(message = "O token nao pode ser nullo")
    @SerializedName("number_token")
    private String numberToken;

}
