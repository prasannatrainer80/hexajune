import { Component } from '@angular/core';
import { RouterModule, RouterOutlet } from '@angular/router';
import { ValidFormComponent } from './valid-form/valid-form.component';
import { EmployFormComponent } from './employ-form/employ-form.component';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './login/login.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: 
  [
    RouterOutlet,
    ValidFormComponent,
    LoginComponent,
    EmployFormComponent,
    HttpClientModule
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'FormsTdfExample';
}
