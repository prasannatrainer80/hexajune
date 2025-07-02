import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private _http : HttpClient) { }

  showEmployee() : Observable<any> {
    return this._http.get("http://localhost:8811/showEmployee")
  }

  searchEmployee(empId : number) : Observable<any> {
    return this._http.get("http://localhost:8811/searchEmployee/"+empId);
  }
}
