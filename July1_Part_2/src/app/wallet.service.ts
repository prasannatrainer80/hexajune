import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class WalletService {

  constructor(private _http : HttpClient) { }

  showCustomerWallet(cusId : number) : Observable<any> {
    return this._http.get("http://localhost:9312/showCustomerWallets/"+cusId);
  }
}
