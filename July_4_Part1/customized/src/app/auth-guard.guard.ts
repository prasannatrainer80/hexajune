import { Injectable } from '@angular/core';
import { CanActivate, CanActivateFn, Router } from '@angular/router';
import { AuthServiceService } from './auth-service.service';

@Injectable({
  providedIn: 'root'
})

export class AuthGuard implements CanActivate {
  constructor(private _authService : AuthServiceService, 
    private _router : Router
  ) {

  }
   canActivate(): boolean {
    let isLoggedIn = this._authService.isPermissionAllowed();
    if (isLoggedIn) {
      return true;
    } else {
      this._router.navigate(['error']);
      return false;
    }
  }
}