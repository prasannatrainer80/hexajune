import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Orders } from './orders';

@Injectable({
  providedIn: 'root'
})
export class OrdersService {

  constructor(private _http : HttpClient) { }

  placeOrder(orders : Orders) : Observable<any> {
    return this._http.post("http://localhost:9312/placeOrder",orders);
  }

  showCustomerPendingOrders(cid : number) : Observable<any> {
    return this._http.get("http://localhost:9312/showCustomerPendingOrders/"+cid);
  }

  showCustomerOrders(cid : number ) : Observable<any> {
    return this._http.get("http://localhost:9312/showCustomerOrders/"+cid);
  }
}
