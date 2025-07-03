import { Component } from '@angular/core';
import {MatTableDataSource, MatTableModule} from '@angular/material/table';
import {MatInputModule} from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select';
import {MatCardModule} from '@angular/material/card';
import {MatSortModule} from '@angular/material/sort';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { Employee } from '../employee';
@Component({
  selector: 'app-mat-table-ex',
  standalone: true,
  imports: [CommonModule, FormsModule, RouterModule,
    MatTableModule, MatInputModule, MatSelectModule,
    MatCardModule,MatSortModule
  ],
  templateUrl: './mat-table-ex.component.html',
  styleUrl: './mat-table-ex.component.css'
})
export class MatTableExComponent {
displayedColumns: string[] = [
    'id',
    'firstname',
    'lastname',
    'email',
    'gender',
    'jobtitle',
    'department',
  ];
employs = [
    new Employee(1,'Raj','Kishore','raj@gmail.com','Male','Support','Angular'),
    new Employee(2,'Nama','Shivayam','shiva@gmail.com','Male','Manager','Angular'),
    new Employee(3,'Sunitya','S','sunitha@gmail.com','Female','Tester','React'),
    new Employee(4,'Mani','Roushan','mani@gmail.com','Male','Coding','Angular'),
    new Employee(5,'Cherish','V','cheri@gmail.com','Male','Support','Sql'),
    new Employee(6,'Stuti','Singh','stuti@gmail.com','Female','Sql','DBA'),
    new Employee(7,'Shwetha','Srivasthav','sv@gmail.com','Female','Support','Angular'),
    new Employee(8,'Venkatesh','V','ven@gmail.com','Male','Manager','Angular'),
   
  ]

  dataSource = new MatTableDataSource(this.employs);

}
