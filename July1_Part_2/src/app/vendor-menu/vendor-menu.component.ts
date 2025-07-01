import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-vendor-menu',
  standalone: true,
  imports: [CommonModule, FormsModule,RouterModule],
  templateUrl: './vendor-menu.component.html',
  styleUrl: './vendor-menu.component.css'
})
export class VendorMenuComponent {

}
