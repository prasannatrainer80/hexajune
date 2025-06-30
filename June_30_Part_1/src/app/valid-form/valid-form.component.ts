import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, NgForm } from '@angular/forms';

@Component({
  selector: 'app-valid-form',
  standalone: true,
  imports: [FormsModule,CommonModule],
  templateUrl: './valid-form.component.html',
  styleUrl: './valid-form.component.css'
})
export class ValidFormComponent {
  sno : number;
  sname : string;
  city : any;
  cgp : number;
  isValid : boolean;
  constructor() {
    this.isValid = false;
  }

  show(validationForm : NgForm) {
    // this.isValid = false;
    if (validationForm.invalid) {
      return;
    }
    this.isValid = true;
    // alert(this.sno);
  }
}
