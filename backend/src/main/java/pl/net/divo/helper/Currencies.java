package pl.net.divo.helper;

import lombok.Getter;
import pl.net.divo.model.Currency;

import java.util.ArrayList;
import java.util.List;

public class Currencies {
    @Getter
    private static final List<Currency> currencies;
    static {
        currencies = new ArrayList<>();
        for (CurrencyEnum en : CurrencyEnum.values()) {
            currencies.add(new Currency(en.name(), en.getName()));
        }
    }
}
