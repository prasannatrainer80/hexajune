import { Component } from '@angular/core';
import { RouterModule, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-customer-menu',
  standalone: true,
  imports: [RouterOutlet,RouterModule],
  templateUrl: './customer-menu.component.html',
  styleUrl: './customer-menu.component.css'
})
export class CustomerMenuComponent {

}
