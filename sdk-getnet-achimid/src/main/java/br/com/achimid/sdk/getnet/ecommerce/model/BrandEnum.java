package br.com.achimid.sdk.getnet.ecommerce.model;

public enum BrandEnum {
    MASTERCARD("Mastercard"),
    VISA("Visa"),
    AMEX("Amex"),
    ELO("Elo"),
    HIPERCARD("Hipercard");

    private final String brand;

    BrandEnum(final String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;
    }

}
