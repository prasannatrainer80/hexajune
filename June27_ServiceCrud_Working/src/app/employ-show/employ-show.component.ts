import { Component } from '@angular/core';
import { EmployService } from '../employ.service';
import { Employ } from '../employ';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-employ-show',
  standalone: true,
  imports: [CommonModule,FormsModule,RouterModule],
  templateUrl: './employ-show.component.html',
  styleUrl: './employ-show.component.css'
})
export class EmployShowComponent {

  employs : Employ[];

  constructor(private _employService : EmployService) {
    this._employService.showEmploy().subscribe(x => {
      this.employs = x;
    })
  }


}
