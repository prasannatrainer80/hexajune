import { Component } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employ-info',
  standalone: true,
  imports: [],
  templateUrl: './employ-info.component.html',
  styleUrl: './employ-info.component.css'
})
export class EmployInfoComponent {
   employ : Employee;
   empId : number;
   constructor(private _empService : EmployeeService) {
    this.empId = parseInt(localStorage.getItem("empId"));
    this._empService.searchEmployee(this.empId).subscribe(x => {
      this.employ = x;
    })
   }
}
