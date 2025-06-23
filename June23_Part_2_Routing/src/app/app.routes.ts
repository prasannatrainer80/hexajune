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

export const routes: Routes = [
    {path:'',component:MenuComponent},
    {path:'first',component:FirstComponent},
    {path:'second',component:SecondComponent},
    {path:'third',component:ThirdComponent},
    {path:'four',component:FourComponent},
    {path:'five',component:FiveComponent},
    {path:'twoway',component:TwoWayComponent},
    {path:'calc',component:CalcComponent}
];
