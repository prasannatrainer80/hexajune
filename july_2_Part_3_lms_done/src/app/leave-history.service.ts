import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { LeaveHistory } from './leave-history';

@Injectable({
  providedIn: 'root'
})
export class LeaveHistoryService {

  constructor(private _http : HttpClient) { }

  leaveHistory(empId : number) : Observable<any> {
    return this._http.get("http://localhost:8811/employeeLeaveHistory/" +empId);
  }

  applyLeave(leaveHistory : LeaveHistory) : Observable<any> {
return this._http.post<string>('http://localhost:8811/applyLeave', leaveHistory, {
    responseType: 'text' as 'json'  // 👈 fix: treat text as JSON-compatible
  });
  }
}
