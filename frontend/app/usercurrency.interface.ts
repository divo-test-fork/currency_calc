import {Currency} from "./currency.interface";

export interface UserCurrency {
    amount: number;
    sourceCurrency: Currency;
    targetCurrency: Currency;
}