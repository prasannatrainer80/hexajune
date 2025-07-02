import { Component } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';

@Component({
  selector: 'app-employ-table',
  standalone: true,
  imports: [CommonModule, FormsModule, RouterModule],
  templateUrl: './employ-table.component.html',
  styleUrl: './employ-table.component.css'
})
export class EmployTableComponent {
  employs : Employee[];

  show(empId : number,mgrId : number) {
    if (mgrId==null) {
      mgrId=0;
    }
    localStorage.setItem("empId",empId.toString());
    localStorage.setItem("mgrId",mgrId.toString());
    this._router.navigate(["dashBoard"]);
  }
  constructor(private _employeeService : EmployeeService, private _router :Router) {
    this._employeeService.showEmployee().subscribe(x => {
      this.employs = x;
    })
  }
}
