import { Component } from '@angular/core';
import { LeaveHistoryService } from '../leave-history.service';
import { LeaveHistory } from '../leave-history';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-employee-leave-history',
  standalone: true,
  imports: [CommonModule, FormsModule, RouterModule],
  templateUrl: './employee-leave-history.component.html',
  styleUrl: './employee-leave-history.component.css'
})
export class EmployeeLeaveHistoryComponent {

  leaveHistory : LeaveHistory[];
  empId : number;
  constructor(private _leaveHistoryService : LeaveHistoryService) {
    this.empId = parseInt(localStorage.getItem("empId"));
    this._leaveHistoryService.leaveHistory(this.empId).subscribe(x => {
      this.leaveHistory = x;
    })
  }
}
