package pl.net.divo.helper;

import org.springframework.format.number.money.MonetaryAmountFormatter;

import java.util.Currency;

public class SimpleCalculator extends Calculator {

    public double getConverter() {
        CurrencyEnum source = CurrencyEnum.valueOf(getSourceCurrency().getKey());
        CurrencyEnum target = CurrencyEnum.valueOf(getTargetCurrency().getKey());

        CurrencyEnum sourceToMain = CurrencyEnum.PLN;
        CurrencyEnum targetToMain = CurrencyEnum.PLN;


        return (targetToMain.getValue() / target.getValue()) / (sourceToMain.getValue() / source.getValue());
    }
}
