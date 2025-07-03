import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms'
import { RouterModule } from '@angular/router';
// import { MatTableDataSource } from '@angular/material/table';
import {MatTableModule} from '@angular/material/table';
import {MatInputModule} from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select';
import {MatCardModule} from '@angular/material/card';
import {MatSortModule} from '@angular/material/sort';
import { Employ } from '../employ';
import { EmployService } from '../employ.service';

@Component({
  selector: 'app-employ-show',
  standalone: true,
  imports: [CommonModule,FormsModule,RouterModule,
 MatTableModule,
    // CommonModule,
    MatInputModule,
    MatSelectModule,
    MatCardModule,
    MatSortModule,
  ],
  templateUrl: './employ-show.component.html',
  styleUrl: './employ-show.component.css'
})
export class EmployShowComponent {
displayedColumns: string[] = [
    'empno',
    'name',
    'gender',
    'dept',
    'desig',
    'basic'
  ];

  employs : Employ[];

  constructor(private _employService : EmployService) {
    this._employService.showEmploy().subscribe(x => {
      this.employs = x;
    })
  }
}
