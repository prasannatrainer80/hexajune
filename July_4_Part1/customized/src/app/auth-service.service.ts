import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {

  isPermitted = false;

  constructor() { }

  allowPermission(key : string) {
    // alert(key);
    if (key==="hexa") {
      this.isPermitted = true;
    } else {
      this.isPermitted = false;
    }
  }

  isPermissionAllowed() {
    return this.isPermitted;
  }
}
