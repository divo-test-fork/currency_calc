package pl.net.divo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.net.divo.helper.CurrencyEnum;

@Getter
@AllArgsConstructor
public class Currency {
    private final String key;
    private final String name;

    public static Currency fromEnum(CurrencyEnum currencyEnum) {
        return new Currency(currencyEnum.name(), currencyEnum.getName());
    }
}
