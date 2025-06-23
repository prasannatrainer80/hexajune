import { Routes } from '@angular/router';
import { FirstComponent } from './first/first.component';
import { MenuComponent } from './menu/menu.component';
import { SecondComponent } from './second/second.component';
import { ThirdComponent } from './third/third.component';
import { FourComponent } from './four/four.component';
import { FiveComponent } from './five/five.component';
import { Component } from '@angular/core';
import { TwoWayComponent } from './two-way/two-way.component';
import { CalcComponent } from './calc/calc.component';
import { LoginComponent } from './login/login.component';

export const routes: Routes = [
    {path:'',component:LoginComponent},
    {path:'menu',component:MenuComponent,
        children : [
        {path:'first',component:FirstComponent,outlet:'hexa'},
        {path:'second',component:SecondComponent,outlet:'hexa'},
        {path:'third',component:ThirdComponent,outlet:'hexa'},
        {path:'four',component:FourComponent,outlet:'hexa'},
        {path:'five',component:FiveComponent,outlet:'hexa'},
        {path:'twoway',component:TwoWayComponent,outlet:'hexa'},
        {path:'calc',component:CalcComponent,outlet:'hexa'}
    ]},
   
];
