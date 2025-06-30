import { Component } from '@angular/core';
import { Employ } from '../employ';
import { CommonModule } from '@angular/common';
import { FormsModule, NgForm } from '@angular/forms';
import { EmployServiceService } from '../employ-service.service';

@Component({
  selector: 'app-employ-form',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './employ-form.component.html',
  styleUrl: './employ-form.component.css'
})
export class EmployFormComponent {
  employ : Employ;
  isValid : boolean;
  msg :string;

  add(employForm : NgForm) {
    // alert(employForm.invalid)
    if (employForm.invalid) {
      return;
    }
    this.isValid = true;
    this._employService.addEmploy(this.employ).subscribe(x => {
      alert(x)
      this.msg = x;
    })
  }

  constructor(private _employService : EmployServiceService) {
    this.employ = new Employ();
    this.isValid = false;
  }


}
