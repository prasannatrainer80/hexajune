import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { StudentFormComponent } from './student-form/student-form.component';
import { EmployFormComponent } from './employ-form/employ-form.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,StudentFormComponent,EmployFormComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'FormsMdfExample';
}
