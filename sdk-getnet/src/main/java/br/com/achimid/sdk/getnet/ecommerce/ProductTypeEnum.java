package br.com.achimid.sdk.getnet.ecommerce;

public enum ProductTypeEnum {

    CASH_CARRY("cash_carry"),
    DIGITAL_CONTENT("digital_content"),
    DIGITAL_GOODS("digital_goods"),
    DIGITAL_PHYSICAL("digital_physical"),
    GIFT_CARD("gift_card"),
    PHISICAL_GOODS("phisical_goods"),
    RENEW_SUBS("renew_subs"),
    SHAREWARE("shareware"),
    SERVICE("service");

    private final String productType;

    ProductTypeEnum(final String productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return productType;
    }

}
