import { Component } from '@angular/core';
import { Employ } from '../employ';
import { EmployService } from '../employ.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-employ-show',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './employ-show.component.html',
  styleUrl: './employ-show.component.css'
})
export class EmployShowComponent {

  employs : Employ[];

  constructor(private _employService : EmployService) {
    this._employService.showEmploy().subscribe(x => {
      // alert(x)
      this.employs = x;
    })
  }
}
