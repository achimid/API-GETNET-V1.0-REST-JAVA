package br.com.achimid.sdk.getnet.ecommerce.model;

public enum TransactionType {

    FULL("FULL"),
    INSTALL_NO_INTEREST("INSTALL_NO_INTEREST"),
    INSTALL_WITH_INTEREST("INSTALL_WITH_INTEREST");

    private final String type;

    TransactionType(final String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

}
