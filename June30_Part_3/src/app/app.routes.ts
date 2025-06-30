import { Routes } from '@angular/router';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { ThirdComponent } from './third/third.component';

export const routes: Routes = [
    {path:'',component:FirstComponent},
    {path:'second/:name/:city',component:SecondComponent},
    {path:'third/:name/:city',component:ThirdComponent}
];
