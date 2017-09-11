package pl.net.divo.controller;

import org.springframework.web.bind.annotation.*;
import pl.net.divo.helper.Calculator;
import pl.net.divo.helper.Currencies;
import pl.net.divo.helper.SimpleCalculator;
import pl.net.divo.model.Currency;
import pl.net.divo.model.UserCurrency;
import pl.net.divo.strategy.CurrencyStrategy;

import java.util.List;

@RestController
@CrossOrigin
public class CurrencyController {

    @RequestMapping(value = "/currency", produces = "application/json")
    public List<Currency> currencies() {
        return Currencies.getCurrencies();
    }

    @RequestMapping(value = "/currency", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public double currencies(@RequestBody UserCurrency userCurrency) {
        Calculator calculator = new SimpleCalculator();
        calculator.setSourceCurrency(userCurrency.getSourceCurrency());
        calculator.setTargetCurrency(userCurrency.getTargetCurrency());

        CurrencyStrategy strategy = new CurrencyStrategy();
        strategy.setCalculator(calculator);
        strategy.setAmount(userCurrency.getAmount());

        return strategy.getAmount();
    }
}