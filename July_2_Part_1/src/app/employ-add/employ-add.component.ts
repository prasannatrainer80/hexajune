import { Component } from '@angular/core';
import { Employ } from '../employ';
import { CommonModule } from '@angular/common';
import { FormsModule, NgForm } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { EmployService } from '../employ.service';

@Component({
  selector: 'app-employ-add',
  standalone: true,
  imports: [CommonModule,FormsModule,RouterModule],
  templateUrl: './employ-add.component.html',
  styleUrl: './employ-add.component.css'
})
export class EmployAddComponent {
  employ : Employ;
  isValid : boolean;
  result : string;
  addEmploy(employForm : NgForm) {
    if (employForm.invalid) {
      return;
    }
    this.isValid = true;
    this._employService.addEmploy(this.employ).subscribe(x => {
      this.result = x;
    })
  }
  constructor(private _employService : EmployService) {
    this.isValid = false;
    this.employ = new Employ();
  }


}
