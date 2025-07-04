import { Component } from '@angular/core';
import { EmployService } from '../employ.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ-info',
  standalone: true,
  imports: [CommonModule,FormsModule,RouterModule],
  templateUrl: './employ-info.component.html',
  styleUrl: './employ-info.component.css'
})
export class EmployInfoComponent {
  empno : number;
  employ : Employ;

  show() {
    this._employService.searchEmploy(this.empno).subscribe(x => {
      this.employ = x;
    })
  }
  constructor(private _employService : EmployService) {

  }
}
