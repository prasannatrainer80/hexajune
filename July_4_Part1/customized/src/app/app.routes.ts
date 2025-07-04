import { Routes } from '@angular/router';
import { SecurePageComponent } from './secure-page/secure-page.component';
import { AboutComponent } from './about/about.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { PermitComponent } from './permit/permit.component';
import { ErrorComponent } from './error/error.component';
import { AuthGuard } from './auth-guard.guard';

export const routes: Routes = [
    {path:'securePage',component:SecurePageComponent,canActivate:[AuthGuard]},
    {path:'about',component:AboutComponent},
    {path:'contactUs',component:ContactUsComponent},
    {path:'permit',component:PermitComponent},
    {path:'error',component:ErrorComponent}
];
