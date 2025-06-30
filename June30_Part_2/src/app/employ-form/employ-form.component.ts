import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-employ-form',
  standalone: true,
  imports: [CommonModule, FormsModule, ReactiveFormsModule],
  templateUrl: './employ-form.component.html',
  styleUrl: './employ-form.component.css'
})
export class EmployFormComponent {

  isValidFormSubmitted: boolean = null;

  employForm = new FormGroup({
  
    empno: new FormControl('', Validators.required),
    name: new FormControl('', Validators.required),
    gender:new FormControl('',Validators.required),
    dept: new FormControl('', Validators.required),
    desig: new FormControl('', Validators.required),
    basic: new FormControl('', Validators.required),
  });

  employSubmit() {
    this.isValidFormSubmitted = false;
    if (this.employForm.invalid) {
      return;
    }
    this.isValidFormSubmitted = true;
  }
}
