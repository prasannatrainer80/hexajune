import { Component } from '@angular/core';
import { EmployService } from '../employ.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ-search',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './employ-search.component.html',
  styleUrl: './employ-search.component.css'
})
export class EmploySearchComponent {
  empno : number;
  employ : Employ;

  search() {
    this._employService.searchEmploy(this.empno).subscribe(x => {
      this.employ = x;
    })  
  }
  constructor(private _employService : EmployService) {

  }
}
