import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-student-form',
  standalone: true,
  imports: [CommonModule,FormsModule,ReactiveFormsModule],
  templateUrl: './student-form.component.html',
  styleUrl: './student-form.component.css'
})
export class StudentFormComponent {
  isValidFormSubmitted: boolean;

  studentForm = new FormGroup({
    uname : new FormControl('',Validators.required),
    gender : new FormControl('',Validators.required),
    married : new FormControl('',Validators.required), 
    tc : new FormControl('',Validators.required)
  })

  studentSubmit() {
    this.isValidFormSubmitted = false;
   if (this.studentForm.invalid) {
    return;
   }
   this.isValidFormSubmitted = true;
  }
  constructor() {
    // this.isValidFormSubmitted = false;
  }
}
