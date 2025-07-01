import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { Orders } from '../orders';
import { OrdersService } from '../orders.service';

@Component({
  selector: 'app-customer-pending-orders',
  standalone: true,
  imports: [CommonModule, FormsModule, RouterModule],
  templateUrl: './customer-pending-orders.component.html',
  styleUrl: './customer-pending-orders.component.css'
})
export class CustomerPendingOrdersComponent {
 customerOrders : Orders[];
    cid : number;
   constructor(private _orderService : OrdersService) {
    this.cid = parseInt(localStorage.getItem("cid"));
    this._orderService.showCustomerPendingOrders(this.cid).subscribe(x => {
      this.customerOrders = x;
    })
   } 
}
