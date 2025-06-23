import { Component } from '@angular/core';

@Component({
  selector: 'app-five',
  standalone: true,
  imports: [],
  templateUrl: './five.component.html',
  styleUrl: './five.component.css'
})
export class FiveComponent {
  result : string;

  amal() {
    this.result = "Hi I am Amal...";
  }

  subhiksha() {
    this.result = "Hi I am Subhiksha...";
  }

  induja() {
    this.result = "Hi I am Induja...";
  }
}
