package pl.net.divo.strategy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.net.divo.helper.Calculator;

@NoArgsConstructor
@Getter
@Setter
public class CurrencyStrategy {
    private Calculator calculator;
    private double amount;

    public double getAmount() {
        return amount * calculator.getConverter();
    }
}
