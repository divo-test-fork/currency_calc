import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import 'rxjs/Rx';
import {Observable}     from 'rxjs/Observable';
import {Currency} from "../currency.interface";
import {UserCurrency} from "../usercurrency.interface";

@Injectable()
export class CurrencyService {
    private currencyUrl = "http://localhost:8091/currency";

    constructor (
        private http: Http
    ) {}

    getCurrencies() {
        return this.http.get(this.currencyUrl)
            .map(res => <Currency[]>res.json())
            .catch(this.handleError);
    }

    getCurrency(userCurrency: UserCurrency) {
        return this.http.post(this.currencyUrl, userCurrency)
            .map(res => <any>res.json())
            .catch(this.handleError);
    }

    private handleError(error: Response) {
        console.error(error);
        return Observable.throw(error.json().error || 'Server error');
    }

}