import { Component } from '@angular/core';
import { AuthRequest } from '../auth-request';
import { EmployService } from '../employ.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-generate-token',
  standalone: true,
  imports: [CommonModule, FormsModule,RouterModule],
  templateUrl: './generate-token.component.html',
  styleUrl: './generate-token.component.css'
})
export class GenerateTokenComponent {
  userName : string;
  passWord : string;
  jwt : string;
  authRequest : AuthRequest;
  
  generate() {
    this.authRequest.username = this.userName;
    this.authRequest.password = this.passWord;
    // alert("Hi");
    this._employService.generateToken(this.authRequest).subscribe(x => {
      alert("Jwt " +x);
      localStorage.setItem("jwt",x);
      this.jwt = x;
      alert(this.jwt);
    })
  }
  constructor(private _employService : EmployService) {
    this.authRequest = new AuthRequest();
  }
}
