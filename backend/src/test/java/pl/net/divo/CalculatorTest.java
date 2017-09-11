package pl.net.divo;

import org.junit.BeforeClass;
import org.junit.Test;
import pl.net.divo.helper.Calculator;
import pl.net.divo.helper.CurrencyEnum;
import pl.net.divo.helper.SimpleCalculator;
import pl.net.divo.model.Currency;
import static org.junit.Assert.*;

public class CalculatorTest {
    private static Calculator calculator = new SimpleCalculator();

    @BeforeClass
    public static void prepareCalculator() {
        calculator.setSourceCurrency(Currency.fromEnum(CurrencyEnum.EUR));
        calculator.setTargetCurrency(Currency.fromEnum(CurrencyEnum.PLN))
        ;
    }

    @Test
    public void testCorrectCalculation() {
        double eurCurrency = CurrencyEnum.EUR.getValue();
        assertEquals(eurCurrency, calculator.getConverter(), 0.001);
    }
}
