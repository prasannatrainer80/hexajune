import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router, RouterEvent, RouterModule } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [RouterModule,FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  userName : string;
  passWord : string;

  constructor(private _router : Router) {

  }

  login() {
    if (this.userName=="Hexaware" && this.passWord=="Hexaware") {
      this._router.navigate(["/menu"]);
    } else {
      alert("Invalid Credentials...");
    }
  }
}
