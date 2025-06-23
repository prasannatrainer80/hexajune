import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-calc',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './calc.component.html',
  styleUrl: './calc.component.css'
})
export class CalcComponent {
  firstNo : number;
  secondNo : number;
  result : number;

  sum() {
    this.result = this.firstNo + this.secondNo;
  }

  sub() {
    this.result = this.firstNo - this.secondNo;
  }

  mult() {
    this.result = this.firstNo * this.secondNo;
  }
}
