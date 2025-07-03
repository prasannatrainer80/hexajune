import { Component, ViewChild } from '@angular/core';
import {MatTableDataSource, MatTableModule} from '@angular/material/table';
import {MatInputModule} from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select';
import {MatCardModule} from '@angular/material/card';
import {MatSort, MatSortModule} from '@angular/material/sort';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { Employ } from '../employ';
import { MatPaginator, MatPaginatorModule } from '@angular/material/paginator';
import { EmployService } from '../employ.service';


@Component({
  selector: 'app-employ-paginator-sort',
  standalone: true,
  imports: [CommonModule, FormsModule,RouterModule,
     MatTableModule, MatInputModule, MatSelectModule,
    MatCardModule,MatSortModule,MatPaginatorModule
  ],
  templateUrl: './employ-paginator-sort.component.html',
  styleUrl: './employ-paginator-sort.component.css'
})
export class EmployPaginatorSortComponent {
  displayedColumns: string[] = [
    'empno',
    'name',
    'gender',
    'dept',
    'desig',
    'basic'
  ];

  employs : Employ[];

  dataSource = new MatTableDataSource<Employ>;
  @ViewChild(MatSort) sort = {} as MatSort;
  @ViewChild(MatPaginator) paginator = {} as MatPaginator;

  constructor(private _employService : EmployService) {
    this._employService.showEmploy().subscribe(x => {
      this.employs = x;
      this.dataSource = new MatTableDataSource(this.employs);
      this.dataSource.sort =this.sort;
      this.dataSource.paginator = this.paginator;
    })
  }

}
