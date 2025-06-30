import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-second',
  standalone: true,
  imports: [],
  templateUrl: './second.component.html',
  styleUrl: './second.component.css'
})
export class SecondComponent {
  name : string;
  city : string;

  constructor(private _activatedRoute : ActivatedRoute) {
    this.name = this._activatedRoute.snapshot.params["name"]
    this.city = this._activatedRoute.snapshot.params["city"]
  }
}
