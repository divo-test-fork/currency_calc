package pl.net.divo.helper;

import lombok.Getter;

public enum CurrencyEnum {

    PLN("złoty", 1.0d),
    USD("dolar", 3.5239d),
    EUR("euro", 4.2511d),
    GBP("funt", 4.6301d);

    @Getter
    private String name;

    @Getter
    private double value;

    CurrencyEnum(String name, double value) {
        this.name = name;
        this.value = value;
    }
}