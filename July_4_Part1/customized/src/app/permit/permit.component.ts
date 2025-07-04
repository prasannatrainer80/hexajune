import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { AuthServiceService } from '../auth-service.service';

@Component({
  selector: 'app-permit',
  standalone: true,
  imports: [CommonModule,FormsModule,RouterModule],
  templateUrl: './permit.component.html',
  styleUrl: './permit.component.css'
})
export class PermitComponent {
  key : string;

  constructor(private _authService : AuthServiceService) {

  }
  validate(){
    // alert(this.key);
    this._authService.allowPermission(this.key);
    // alert(this._authService.isPermissionAllowed());
  }
}
