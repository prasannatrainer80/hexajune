import { Routes } from '@angular/router';
import { EmployTableComponent } from './employ-table/employ-table.component';
import { DashBoardComponent } from './dash-board/dash-board.component';

export const routes: Routes = [
    {path:'',component:EmployTableComponent},
    {path:'dashBoard',component:DashBoardComponent}
];
