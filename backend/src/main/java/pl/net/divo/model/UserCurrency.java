package pl.net.divo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserCurrency {
    private int amount;
    private Currency targetCurrency;
    private Currency sourceCurrency;
}
