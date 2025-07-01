import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { Orders } from '../orders';
import { VendorService } from '../vendor.service';

@Component({
  selector: 'app-vendor-pending-orders',
  standalone: true,
  imports: [CommonModule,FormsModule,RouterModule],
  templateUrl: './vendor-pending-orders.component.html',
  styleUrl: './vendor-pending-orders.component.css'
})
export class VendorPendingOrdersComponent {
  vid : number;
  vendors : Orders[];
  constructor(private _vendorService : VendorService) {
    this.vid = parseInt(localStorage.getItem("vid"));
    this._vendorService.showVendorPendingOrders(this.vid).subscribe(x => {
      this.vendors = x;
    })
  }
}
