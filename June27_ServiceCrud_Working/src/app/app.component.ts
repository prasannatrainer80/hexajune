import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { EmployShowComponent } from './employ-show/employ-show.component';
import { EmploySearchComponent } from './employ-search/employ-search.component';
import { EmployAddComponent } from './employ-add/employ-add.component';
import { EmployDeleteComponent } from './employ-delete/employ-delete.component';
import { EmployUpdateComponent } from './employ-update/employ-update.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,EmployShowComponent,EmploySearchComponent, EmployAddComponent,
    EmployDeleteComponent, EmployUpdateComponent

  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'EmployServiceCrud';
}
