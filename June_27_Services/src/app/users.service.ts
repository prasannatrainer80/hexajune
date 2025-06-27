import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  constructor(private _httpService : HttpClient) { }

  showUsers() : Observable<any> {
    return this._httpService.get("http://jsonplaceholder.typicode.com/users")
  }
}
