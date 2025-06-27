import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { EmployService } from '../employ.service';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ-add',
  standalone: true,
  imports: [CommonModule, FormsModule, RouterModule],
  templateUrl: './employ-add.component.html',
  styleUrl: './employ-add.component.css'
})
export class EmployAddComponent {
  eno : number;
  nam : string;
  gen : string;
  dpt : string;
  dsg : string;
  bas :number; 

  employ : Employ;

  constructor(private _employService : EmployService) {}

  addEmploy() {
    this.employ = new Employ();
    this.employ.empno = this.eno;
    this.employ.name = this.nam;
    this.employ.gender = this.gen;
    this.employ.dept = this.dpt;
    this.employ.desig = this.dsg;
    this.employ.basic = this.bas;

    this._employService.addEmploy(this.employ).subscribe(x => {
      alert(x);
    })
  }
}
