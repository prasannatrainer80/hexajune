import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-customer-info',
  standalone: true,
  imports: [FormsModule,CommonModule,RouterModule],
  templateUrl: './customer-info.component.html',
  styleUrl: './customer-info.component.css'
})
export class CustomerInfoComponent {
  cid : number;
  customer : Customer;
  constructor(private _customerService : CustomerService) {
    this.cid = parseInt(localStorage.getItem("cid"));
    this._customerService.searchCustomer(this.cid).subscribe(x => {
      this.customer = x;
    })
  }
}
