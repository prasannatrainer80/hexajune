import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employ } from './employ';

@Injectable({
  providedIn: 'root'
})
export class EmployService {

  constructor(private _http : HttpClient) { }

  addEmploy(employ : Employ) {
    return this._http.post("http://localhost:9000/addEmploy",employ);
  }

  showEmploy() : Observable<any> {
    return this._http.get("http://localhost:9000/showEmploy");
  }

  searchEmploy(empno : number) : Observable<any> {
    return this._http.get("http://localhost:9000/searchEmploy/"+empno);
  }
}
