import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employ } from './employ';
import { Observable,tap } from 'rxjs';
import { AuthRequest } from './auth-request';

@Injectable({
  providedIn: 'root'
})
export class EmployService {

  constructor(private _http : HttpClient) { }

  showEmploy(token : string) : Observable<any> {

    var headers_object = new HttpHeaders({
    "Content-Type":"application/json",
    "Authorization":"Bearer "+token
  });
    const httpOptions = {
      headers : headers_object
    }

    return this._http.get("http://localhost:1133/employ/showEmploy",httpOptions);
  }

  generateToken(authRequest : AuthRequest) : Observable<any> {
    return this._http.post("http://localhost:1133/employ/generateToken",authRequest,
    {responseType:'text'}).pipe(
      tap((resp) => {
        alert(resp);
      })
    )
  }

  addEmploy(employ : Employ) : Observable<any> {
     return this._http.post<string>('http://localhost:1133/employ/addEmploy', employ, {
    responseType: 'text' as 'json'  // 👈 fix: treat text as JSON-compatible
  });
  }
}
