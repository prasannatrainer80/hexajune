import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { InfoComponent } from './info/info.component';
import { ErrorComponent } from './error/error.component';
import { AllowMeComponent } from './allow-me/allow-me.component';
import { AuthGuard } from './auth-guard.guard';

export const routes: Routes = [
   // {path:'',component : HomeComponent },
   {path:'about',component:AboutComponent},
   {path:'info',component:InfoComponent},
   {path:'home',component:HomeComponent,canActivate:[AuthGuard]},
   {path:'error',component:ErrorComponent},
   {path:'allowme',component:AllowMeComponent}
];
