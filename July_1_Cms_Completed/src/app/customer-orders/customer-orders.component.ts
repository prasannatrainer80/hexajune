import { Component } from '@angular/core';
import { Orders } from '../orders';
import { OrdersService } from '../orders.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-customer-orders',
  standalone: true,
  imports: [CommonModule,FormsModule,RouterModule],
  templateUrl: './customer-orders.component.html',
  styleUrl: './customer-orders.component.css'
})
export class CustomerOrdersComponent {
   customerOrders : Orders[];
    cid : number;
   constructor(private _orderService : OrdersService) {
    this.cid = parseInt(localStorage.getItem("cid"));
    this._orderService.showCustomerOrders(this.cid).subscribe(x => {
      this.customerOrders = x;
    })
   } 
}
