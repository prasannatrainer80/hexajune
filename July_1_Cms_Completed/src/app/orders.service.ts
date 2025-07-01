import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Orders } from './orders';

@Injectable({
  providedIn: 'root'
})
export class OrdersService {

  constructor(private _http : HttpClient) { }

// doApply(orders: Orders): Observable<string> {
//   return this._http.post<string>('http://localhost:9312/placeOrder', orders, {
//     responseType: 'text' as 'json'  // 👈 fix: treat text as JSON-compatible
//   });
// }

  acceptOrReject(ordId : number, status: string) : Observable<any> {
    return this._http.post("http://localhost:9312/acceptOrReject/"+ordId + "/"+status,
      null,{
    responseType: 'text' as 'json'  // 👈 fix: treat text as JSON-compatible
  })
  }
  placeOrder(orders : Orders) : Observable<any> {
   return this._http.post<string>('http://localhost:9312/placeOrder', orders, {
    responseType: 'text' as 'json'  // 👈 fix: treat text as JSON-compatible
  });
  }

  showCustomerPendingOrders(cid : number) : Observable<any> {
    return this._http.get("http://localhost:9312/showCustomerPendingOrders/"+cid);
  }

  showCustomerOrders(cid : number ) : Observable<any> {
    return this._http.get("http://localhost:9312/showCustomerOrders/"+cid);
  }
}
