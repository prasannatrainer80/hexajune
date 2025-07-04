import { Routes } from '@angular/router';
import { EmployShowComponent } from './employ-show/employ-show.component';
import { EmployInfoComponent } from './employ-info/employ-info.component';
import { ErrorComponent } from './error/error.component';
import { PermitComponent } from './permit/permit.component';
import { AuthGuard } from './auth-guard.guard';

export const routes: Routes = [
    {path:'employShow',component:EmployShowComponent,canActivate:[AuthGuard]},
    {path:'employInfo',component:EmployInfoComponent},
    {path:'error',component:ErrorComponent},
    {path:'permit',component:PermitComponent}
];
