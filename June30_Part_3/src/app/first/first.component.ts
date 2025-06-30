import { Component } from '@angular/core';
import { Router, RouterModule, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-first',
  standalone: true,
  imports: [RouterModule, RouterOutlet],
  templateUrl: './first.component.html',
  styleUrl: './first.component.css'
})
export class FirstComponent {
  name : string;
  city : string;
  constructor(private _router : Router) {
    this.name = "Ayush"
    this.city = "Pune"
  }
  third() {
    this._router.navigate(["third",this.name,this.city]);
  }

}
