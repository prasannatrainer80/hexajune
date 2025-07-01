import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CustomerLoginComponent } from './customer-login/customer-login.component';
import { CustomerMenuComponent } from './customer-menu/customer-menu.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,CustomerLoginComponent,CustomerMenuComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'CmsExample';
}
