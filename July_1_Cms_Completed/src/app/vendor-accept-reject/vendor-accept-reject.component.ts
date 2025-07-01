import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { Orders } from '../orders';
import { VendorService } from '../vendor.service';
import { OrdersService } from '../orders.service';

@Component({
  selector: 'app-vendor-accept-reject',
  standalone: true,
  imports: [CommonModule,FormsModule,RouterModule],
  templateUrl: './vendor-accept-reject.component.html',
  styleUrl: './vendor-accept-reject.component.css'
})
export class VendorAcceptRejectComponent {
  vid : number;
    vendors : Orders[];
    result : string;
    yes(ordId : number) {
      // alert(ordId);
      let status : "YES";
      this._orderService.acceptOrReject(ordId,"YES").subscribe(x => {
        this.result = x;
        alert(this.result);
      })
    }
    no (ordId : number) {
      let status : "NO";
      this._orderService.acceptOrReject(ordId,"NO").subscribe(x => {
        this.result = x;
        alert(this.result);
      })
    }
    constructor(private _vendorService : VendorService,private _orderService : OrdersService) {
      this.vid = parseInt(localStorage.getItem("vid"));
      this._vendorService.showVendorPendingOrders(this.vid).subscribe(x => {
        this.vendors = x;
      })
    }
}
