import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { ThirdComponent } from './third/third.component';
import { FourComponent } from './four/four.component';
import { FiveComponent } from './five/five.component';
import { TwoWayComponent } from './two-way/two-way.component';
import { CalcComponent } from './calc/calc.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,FirstComponent,SecondComponent,ThirdComponent,FourComponent,
    FiveComponent, TwoWayComponent,CalcComponent
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'HelloNew';
}
