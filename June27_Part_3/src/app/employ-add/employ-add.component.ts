import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { EmployService } from '../employ.service';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ-add',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './employ-add.component.html',
  styleUrl: './employ-add.component.css'
})
export class EmployAddComponent {
  eno : number;
  nam : string;
  gen : string;
  dpt : string;
  dsg : string;
  bas : number;

  res : string;

  employ : Employ;
  constructor(private employService : EmployService) {
  
  }

  addEmploy() {
    // alert(this.eno);
    // alert(this.nam);
      this.employ = new Employ()
    this.employ.empno = this.eno;
    this.employ.name = this.nam;
    this.employ.gender = this.gen;
    this.employ.dept = this.dpt;
    this.employ.desig = this.dsg;
    this.employ.basic = this.bas;

    // alert(this.employ.empno);
    // alert(this.employ.name);
    // alert(this.employ.basic);

    this.employService.addEmploy(this.employ).subscribe(x => {
      this.res = x.toString();
    })

  }
}
