package br.com.achimid.sdk.getnet.ecommerce;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@EqualsAndHashCode(callSuper = false)
public class Period {

    @NotNull
    @Size(max = 15)
    private PeriodTypeEnum type;

    @NotNull
    @Size(min = 0)
    @SerializedName("billing_cycle")
    private String billingCycle;

    @SerializedName("specific_cycle_in_days")
    private Number specificCycleInDays;

}
