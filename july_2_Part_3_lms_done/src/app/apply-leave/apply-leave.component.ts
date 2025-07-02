import { Component } from '@angular/core';
import { LeaveHistoryService } from '../leave-history.service';
import { LeaveHistory } from '../leave-history';
import { CommonModule } from '@angular/common';
import { FormsModule, NgForm } from '@angular/forms';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-apply-leave',
  standalone: true,
  imports: [CommonModule,FormsModule,RouterModule],
  templateUrl: './apply-leave.component.html',
  styleUrl: './apply-leave.component.css'
})
export class ApplyLeaveComponent {

  leaveHistory : LeaveHistory;
  isValid : boolean;
   ltype : string;
   result : string;
   leaveType = [
    "EL","PL","ML"
  ]
  applyLeave(applyLeaveForm : NgForm) {
    // alert("Hi");
    // alert(applyLeaveForm.invalid);
    if (applyLeaveForm.invalid) {
      return;
    }
    this.isValid = true;
    this.leaveHistory.leaveType = this.ltype;
    // alert(localStorage.getItem("empId"));
    this.leaveHistory.empId = parseInt(localStorage.getItem("empId"));

    // alert(this.leaveHistory.empId);
    this._leaveHistoryService.applyLeave(this.leaveHistory).subscribe(x => {
      this.result = x;
    })
  }
  constructor(private _leaveHistoryService : LeaveHistoryService) {
    
    this.leaveHistory = new LeaveHistory();
    this.isValid = false;
  }
}
