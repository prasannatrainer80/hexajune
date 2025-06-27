import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employ } from './employ';

@Injectable({
  providedIn: 'root'
})
export class EmployService {

  constructor(private _http : HttpClient) { }

  login(userName : string, passCode : string) : Observable<any> {
    return this._http.get("http://localhost:9000/login/"+userName + "/"+passCode);
  }

  updateEmploy(employ : Employ) {
    return this._http.put("http://localhost:9000/updateEmploy",employ);
  }

  deleteEmploy(eno : number) : Observable<any> {
    return this._http.delete("http://localhost:9000/deleteEmploy/"+eno);
  }

  addEmploy(employ : Employ) : Observable<any> {
    return this._http.post("http://localhost:9000/addEmploy",employ);
  }

  showEmploy() : Observable<any> {
    return this._http.get("http://localhost:9000/showEmploy")
  }

  searchEmploy(empno : number) : Observable<any> {
    return this._http.get("http://localhost:9000/searchEmploy/"+empno);
  }
}
