import { Routes } from '@angular/router';
import { MenuComponent } from './menu/menu.component';
import { Component } from '@angular/core';
import { EmployShowComponent } from './employ-show/employ-show.component';
import { EmploySearchComponent } from './employ-search/employ-search.component';
import { EmployAddComponent } from './employ-add/employ-add.component';
import { EmployDeleteComponent } from './employ-delete/employ-delete.component';
import { EmployUpdateComponent } from './employ-update/employ-update.component';
import { LoginComponent } from './login/login.component';

export const routes: Routes = [
    {path:'',component:LoginComponent},
    {path:'menu',component:MenuComponent},
    {path:'menu',component:MenuComponent, children: [
          {path:'employShow',component:EmployShowComponent,outlet:'hexa'},
          {path:'employSearch',component:EmploySearchComponent,outlet:'hexa'},
          {path:'employAdd',component:EmployAddComponent,outlet:'hexa'},
          {path:'employDelete',component:EmployDeleteComponent,outlet:'hexa'},
          {path:'employUpdate',component:EmployUpdateComponent,outlet:'hexa'}
    ]}
];
