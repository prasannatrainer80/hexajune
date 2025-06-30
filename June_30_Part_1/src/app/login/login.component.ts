import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  user : string;
  pwd : string;
  flag : boolean;

  constructor() {
    this.flag = false;
  }

  validate(loginForm : NgForm) {
    if (loginForm.invalid) {
      return;
    }
    this.flag = true;
  }
}
