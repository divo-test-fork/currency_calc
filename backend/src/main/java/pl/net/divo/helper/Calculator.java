package pl.net.divo.helper;

import lombok.Getter;
import lombok.Setter;
import pl.net.divo.model.Currency;

@Setter
public abstract class Calculator {
    @Getter
    private Currency sourceCurrency;
    @Getter
    private Currency targetCurrency;

    public abstract double getConverter();
}
