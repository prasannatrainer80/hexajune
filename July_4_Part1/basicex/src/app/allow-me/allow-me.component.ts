import { Component } from '@angular/core';
import { AuthServiceService } from '../auth-service.service';

@Component({
  selector: 'app-allow-me',
  standalone: true,
  imports: [],
  templateUrl: './allow-me.component.html',
  styleUrl: './allow-me.component.css'
})
export class AllowMeComponent {
  constructor(private _authService : AuthServiceService) {
    this._authService.changeAuth();
    alert(this._authService.isLoggedIn);
  }


}
