import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { Vendor } from '../vendor';
import { VendorService } from '../vendor.service';

@Component({
  selector: 'app-vendor-info',
  standalone: true,
  imports: [CommonModule,FormsModule,RouterModule],
  templateUrl: './vendor-info.component.html',
  styleUrl: './vendor-info.component.css'
})
export class VendorInfoComponent {
  vendor : Vendor;
  vid : number;
  constructor(private _vendorService : VendorService) {
    this.vid = parseInt(localStorage.getItem("vid"));
    this._vendorService.searchByVid(this.vid).subscribe(x => {
      this.vendor = x;
    })
  }
}
