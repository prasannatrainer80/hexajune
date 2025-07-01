import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MenuService {

  constructor(private _http : HttpClient) { }

  showMenu() : Observable<any> {
    return this._http.get("http://localhost:9312/showMenu");
  }
}
