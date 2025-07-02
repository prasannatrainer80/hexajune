import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-my-manager-info',
  standalone: true,
  imports: [CommonModule, FormsModule, RouterModule],
  templateUrl: './my-manager-info.component.html',
  styleUrl: './my-manager-info.component.css'
})
export class MyManagerInfoComponent {
  mgrId : number;
  employ : Employee;

  constructor(private _employeeService : EmployeeService) {
    this.mgrId = parseInt(localStorage.getItem("mgrId"));
    this._employeeService.searchEmployee(this.mgrId).subscribe(x => {
      this.employ = x;
    })
  }
}
