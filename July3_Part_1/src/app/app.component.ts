import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { EmployShowComponent } from './employ-show/employ-show.component';
import { MatTableExComponent } from './mat-table-ex/mat-table-ex.component';
import { EmployPaginatorSortComponent } from './employ-paginator-sort/employ-paginator-sort.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,EmployShowComponent,MatTableExComponent,EmployPaginatorSortComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'PaginationEx';
}
