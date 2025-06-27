import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { EmployService } from '../employ.service';

@Component({
  selector: 'app-employ-delete',
  standalone: true,
  imports: [CommonModule, FormsModule, RouterModule],
  templateUrl: './employ-delete.component.html',
  styleUrl: './employ-delete.component.css'
})
export class EmployDeleteComponent {
  eno : number;

  constructor(private _employService : EmployService ) {} 

  delete() {
    this._employService.deleteEmploy(this.eno).subscribe(x => {
      alert(x);
    })
  }
}
