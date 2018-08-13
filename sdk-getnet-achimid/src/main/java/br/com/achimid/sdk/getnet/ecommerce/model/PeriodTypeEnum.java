package br.com.achimid.sdk.getnet.ecommerce.model;

public enum PeriodTypeEnum {

    YEARLY("yearly"),
    MONTHLY("monthly"),
    BIOMONTHLY("bimonthly"),
    QUARTERLY("quarterly"),
    SEMESTERLY("semesterly"),
    SPECIFIC("specific");

    private final String trye;

    PeriodTypeEnum(final String trye) {
        this.trye = trye;
    }

    @Override
    public String toString() {
        return trye;
    }

}
