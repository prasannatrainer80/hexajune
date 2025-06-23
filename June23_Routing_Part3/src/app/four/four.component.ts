import { Component } from '@angular/core';

@Component({
  selector: 'app-four',
  standalone: true,
  imports: [],
  templateUrl: './four.component.html',
  styleUrl: './four.component.css'
})
export class FourComponent {

  bala() {
    alert("Hi I am Bala....")
  }

  akshaya() {
    alert("Hi I am Akshaya...")
  }

  rishab() {
    alert("Hi I am Rishabarjun...")
  }
}
