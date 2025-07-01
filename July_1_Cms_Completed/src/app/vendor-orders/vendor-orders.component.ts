import { Component } from '@angular/core';
import { Vendor } from '../vendor';
import { VendorService } from '../vendor.service';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { Orders } from '../orders';

@Component({
  selector: 'app-vendor-orders',
  standalone: true,
  imports: [CommonModule,RouterModule,FormsModule],
  templateUrl: './vendor-orders.component.html',
  styleUrl: './vendor-orders.component.css'
})
export class VendorOrdersComponent {
   venId : number;
   vendors : Orders[];
   constructor(private _vendorService : VendorService) {
    this.venId = parseInt(localStorage.getItem("vid"));
    this._vendorService.showVendorOrders(this.venId).subscribe(x => {
      this.vendors = x;
    })
   }
}
