package br.com.achimid.sdk.getnet.ecommerce;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Device {

    @SerializedName("ip_address")
    private String ipAddress;

    @SerializedName("device_id")
    private String deviceId;

}
