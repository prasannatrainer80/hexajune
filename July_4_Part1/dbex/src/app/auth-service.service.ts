import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {

  isAuthorized : boolean;

  constructor() { 
    this.isAuthorized = false;
  }

  authorize() {
    this.isAuthorized = true;
  }

  showAuthStatus() {
    return this.isAuthorized;
  }
}
