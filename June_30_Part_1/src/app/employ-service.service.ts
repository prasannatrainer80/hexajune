import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employ } from './employ';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployServiceService {

  constructor(private _http : HttpClient) { }

  addEmploy(employ : Employ) : Observable<any> {
    return this._http.post("http://localhost:9000/addEmploy",employ);
  }
}
