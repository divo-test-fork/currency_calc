package pl.net.divo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import pl.net.divo.helper.Calculator;
import pl.net.divo.strategy.CurrencyStrategy;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CurrencyStrategyTest {
    @Mock
    private static Calculator calculator;

    @Test
    public void testCorrectStrategy() {
        when(calculator.getConverter()).thenReturn(1.0);

        CurrencyStrategy strategy = new CurrencyStrategy();
        strategy.setCalculator(calculator);
        strategy.setAmount(100);

        assertEquals(strategy.getAmount(), 100, 0.01);
    }
}