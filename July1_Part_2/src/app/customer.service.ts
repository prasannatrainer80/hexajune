import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { observableToBeFn } from 'rxjs/internal/testing/TestScheduler';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private _http : HttpClient) { }

  searchCustomer(cid : number) : Observable<any> {
    return this._http.get("http://localhost:9312/searchCustomer/"+cid);
  }
  customerLogin(user : string, pwd : string) : Observable<any> {
    return this._http.get("http://localhost:9312/customerLogin/"+user+ "/"+pwd);
  }

  searchByUserName(user : string) : Observable<any> {
    return this._http.get("http://localhost:9312/searchByUserName/"+user);
  }
}
