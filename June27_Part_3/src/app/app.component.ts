import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { EmployShowComponent } from './employ-show/employ-show.component';
import { HttpClientModule } from '@angular/common/http';
import { EmploySearchComponent } from './employ-search/employ-search.component';
import { EmployAddComponent } from './employ-add/employ-add.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,EmployShowComponent,HttpClientModule,EmploySearchComponent,EmployAddComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'EmployServiceExample';
}
