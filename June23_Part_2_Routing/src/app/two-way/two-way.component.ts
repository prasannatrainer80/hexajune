import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-two-way',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './two-way.component.html',
  styleUrl: './two-way.component.css'
})
export class TwoWayComponent {
  name : string
  constructor() {
    this.name = "Prasanna"
  }
}
