import { Routes } from '@angular/router';
import { MenuComponent } from './menu/menu.component';
import { EmployShowComponent } from './employ-show/employ-show.component';
import { EmploySearchComponent } from './employ-search/employ-search.component';
import { EmployAddComponent } from './employ-add/employ-add.component';

export const routes: Routes = [
    {path:'',component:MenuComponent},
    {path:'menu',component:MenuComponent,children:[
        {path:'employShow',component:EmployShowComponent,outlet:'hexa'},
        {path:'employSearch',component:EmploySearchComponent,outlet:'hexa'},
        {path:'employAdd',component:EmployAddComponent,outlet:'hexa'},
        
    ]}
];
