import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { AuthServiceService } from '../auth-service.service';
import { EmployService } from '../employ.service';

@Component({
  selector: 'app-permit',
  standalone: true,
  imports: [CommonModule,FormsModule,RouterModule],
  templateUrl: './permit.component.html',
  styleUrl: './permit.component.css'
})
export class PermitComponent {
  userName : string;
  passWord : string;

  constructor(private _authService : AuthServiceService,
      private _employService : EmployService
  ) {

  }
  login() {
    this._employService.login(this.userName,this.passWord).subscribe(x => {
      if (x=="1") {
        this._authService.authorize();
        alert(this._authService.showAuthStatus());
      } else {
        alert("Invalid Credentials...");
      }
    })
  }
}
