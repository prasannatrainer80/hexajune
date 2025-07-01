import { Component } from '@angular/core';
import { Menu } from '../menu';
import { Vendor } from '../vendor';
import { Orders } from '../orders';
import { CommonModule } from '@angular/common';
import { FormsModule, NgForm } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { MenuService } from '../menu.service';
import { VendorService } from '../vendor.service';
import { Wallet } from '../wallet';
import { WalletService } from '../wallet.service';
import { OrdersService } from '../orders.service';

@Component({
  selector: 'app-place-order',
  standalone: true,
  imports: [CommonModule,FormsModule,RouterModule],
  templateUrl: './place-order.component.html',
  styleUrl: './place-order.component.css'
})
export class PlaceOrderComponent {
  menu : Menu[];
  vendor : Vendor[];
  orders : Orders;
  wallet : Wallet[];
  result : any;
  placeOrder(orderForm : NgForm) {
    if (orderForm.invalid) {
      return;
    }
    this._orderService.placeOrder(this.orders).subscribe(x => {
      this.result = x;

      alert(this.result);
    })
    // alert(this.orders.cusId)
    // alert(this.orders.venId);
    // alert(this.orders.menId);
    // alert(this.orders.walSource);
  }
  constructor(private _menuService : MenuService, 
      private _venService : VendorService,
      private _walletService : WalletService,
      private _orderService : OrdersService
    ) {

    this.orders = new Orders();
    this.orders.cusId = parseInt(localStorage.getItem("cid"));

    this._menuService.showMenu().subscribe(x => {
      this.menu = x;
    })

    this._venService.showVendor().subscribe(x => {
      this.vendor = x;
    })

    this._walletService.showCustomerWallet(this.orders.cusId).subscribe(x => {
      this.wallet = x;
    })
  }
}
