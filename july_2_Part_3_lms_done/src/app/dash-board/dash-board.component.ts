import { Component } from '@angular/core';
import { EmployInfoComponent } from '../employ-info/employ-info.component';
import { MyManagerInfoComponent } from '../my-manager-info/my-manager-info.component';
import { EmployeeLeaveHistoryComponent } from '../employee-leave-history/employee-leave-history.component';
import { ApplyLeaveComponent } from '../apply-leave/apply-leave.component';

@Component({
  selector: 'app-dash-board',
  standalone: true,
  imports: [EmployInfoComponent, MyManagerInfoComponent, EmployeeLeaveHistoryComponent, ApplyLeaveComponent],
  templateUrl: './dash-board.component.html',
  styleUrl: './dash-board.component.css'
})
export class DashBoardComponent {

}
