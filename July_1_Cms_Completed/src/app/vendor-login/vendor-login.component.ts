import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import { Vendor } from '../vendor';
import { VendorService } from '../vendor.service';

@Component({
  selector: 'app-vendor-login',
  standalone: true,
  imports: [CommonModule,FormsModule,RouterModule],
  templateUrl: './vendor-login.component.html',
  styleUrl: './vendor-login.component.css'
})
export class VendorLoginComponent {

  vendor : Vendor;
  vendorFound : Vendor;
  isValid : boolean;
  
  constructor(private _vendorService : VendorService,
    private _router : Router

  ) {
    this.isValid = false;
    this.vendor = new Vendor();
  }

  login(loginForm : NgForm) {
    if (loginForm.invalid) {
      return;
    }
    this.isValid = true;
    this._vendorService.vendorLogin(this.vendor.venUsername,this.vendor.venPassword)
    .subscribe(x => {
      alert(x);
      if (x=="1") { 
        this._vendorService.searchByUserName(this.vendor.venUsername).subscribe(x => {
          this.vendorFound = x;
          localStorage.setItem("vid",this.vendorFound.venId.toString());
        })
        this._router.navigate(["vendorMenu"])
      }
    })
  }
}
