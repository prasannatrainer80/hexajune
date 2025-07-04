import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { observableToBeFn } from 'rxjs/internal/testing/TestScheduler';

@Injectable({
  providedIn: 'root'
})
export class EmployService {

  constructor(private _http : HttpClient) { }

  showEmploy() : Observable<any> {
    return this._http.get("http://localhost:9000/showEmploy");
  }

  searchEmploy(empno : number) : Observable<any> {
    return this._http.get("http://localhost:9000/searchEmploy/"+empno);
  }

  login(user : string, pwd : string) : Observable<any> {
    return this._http.get("http://localhost:9000/login/"+user+"/"+pwd);
  }
}
