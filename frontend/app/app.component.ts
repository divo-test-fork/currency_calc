import { Component, OnInit } from '@angular/core';
import {Currency, UserCurrency} from "./usercurrency.interface";
import {CurrencyService} from "./shared/currency.service";

@Component({
    moduleId: module.id,
    selector: 'my-app',
    templateUrl: 'app.component.html',
    directives: [],
    providers: [CurrencyService]
})
export class AppComponent implements OnInit {
    constructor(private currencyService: CurrencyService) { }
    private errorMessage: string;

    public userCurrency: UserCurrency;
    public currencyAmount: number;
    public currencies = [];

    ngOnInit() {
        this.userCurrency = <UserCurrency>{
            amount: 0,
            sourceCurrency: '',
            targetCurrency: ''
        }
        this.currencyAmount = 0;

        this.getCurrencies();
    }
    public get(f: UserCurrency) {
        this.getCurrency();
    }
    private getCurrencies() {
        this.currencyService.getCurrencies().subscribe(
            value => {
                this.currencies = value;
                this.userCurrency = <UserCurrency>{
                    amount: 0,
                    sourceCurrency: this.currencies[0],
                    targetCurrency: this.currencies[1]
                }
            },
            error => this.errorMessage = <any>error
        );
    }
    private getCurrency() {
        this.currencyService.getCurrency(this.userCurrency).subscribe(
            value => {
                this.currencyAmount = value;
            },
            error => this.errorMessage = <any>error
        );
    }
}