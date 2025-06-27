import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { EmployService } from '../employ.service';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ-search',
  standalone: true,
  imports: [CommonModule,FormsModule,RouterModule],
  templateUrl: './employ-search.component.html',
  styleUrl: './employ-search.component.css'
})
export class EmploySearchComponent {

  eno : number;
  employ : Employ;

  constructor(private _employService : EmployService) {}

  search() {
    this._employService.searchEmploy(this.eno).subscribe(x => {
      this.employ = x;
    })
  }
}
