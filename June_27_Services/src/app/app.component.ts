import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { UserShowComponent } from './user-show/user-show.component';
import { EmployShowComponent } from './employ-show/employ-show.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,UserShowComponent,EmployShowComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'ServiceExampleNew';
}
