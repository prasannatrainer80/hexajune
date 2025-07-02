import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LeaveHistoryService {

  constructor(private _http : HttpClient) { }

  leaveHistory(empId : number) : Observable<any> {
    return this._http.get("http://localhost:8811/employeeLeaveHistory/" +empId);
  }
}
