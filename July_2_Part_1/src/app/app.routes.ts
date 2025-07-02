import { Routes } from '@angular/router';
import { MenuComponent } from './menu/menu.component';
import { EmployAddComponent } from './employ-add/employ-add.component';
import { EmployShowComponent } from './employ-show/employ-show.component';
import { GenerateTokenComponent } from './generate-token/generate-token.component';

export const routes: Routes = 
[
    {path:'',component:MenuComponent},
    {path:'menu',component:MenuComponent,children:[
        {path:'employAdd',component:EmployAddComponent,outlet:'hexa'},
        {path:'employShow',component:EmployShowComponent,outlet:'hexa'},
        {path:'generateToken',component:GenerateTokenComponent,outlet:'hexa'},
    ]}
];
