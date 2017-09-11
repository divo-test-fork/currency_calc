package pl.net.divo;

import org.junit.Test;
import org.mockito.Mock;
import pl.net.divo.helper.Calculator;
import pl.net.divo.helper.CurrencyEnum;
import pl.net.divo.model.Currency;
import pl.net.divo.strategy.CurrencyStrategy;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class CurrencyTest {

    @Test
    public void testCurrency() {
        Currency currency = new Currency(CurrencyEnum.PLN.name(), CurrencyEnum.PLN.getName());
        assertEquals(currency.getKey(), "PLN");
        assertEquals(currency.getName(), "złoty");
    }

    @Test
    public void testProperMapFromEnum() {
        Currency currency = Currency.fromEnum(CurrencyEnum.PLN);
        assertEquals(currency.getKey(), "PLN");
        assertEquals(currency.getName(), "złoty");
    }
}
