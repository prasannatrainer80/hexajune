import { Component } from '@angular/core';
import { Customer } from '../customer';
import { CommonModule } from '@angular/common';
import { FormsModule, NgForm } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-customer-login',
  standalone: true,
  imports: [CommonModule,FormsModule,RouterModule],
  templateUrl: './customer-login.component.html',
  styleUrl: './customer-login.component.css'
})
export class CustomerLoginComponent {
  customer : Customer;
    isValid : boolean;
  customerFound : Customer;
  login(loginForm : NgForm) {
    this.isValid = false;
    if (loginForm.invalid) {
      return;
    }
    this.isValid = true;
    this._customerService.
      customerLogin(this.customer.cusUsername,this.customer.cusPassword).subscribe(x => {
        if (x=="1") {
          // alert("Correct");
          this._customerService.searchByUserName(this.customer.cusUsername).subscribe(y => {
            this.customerFound = y;
            // alert(this.customerFound.cusId);
            localStorage.setItem("cid",this.customerFound.cusId.toString());
          })
          this._router.navigate(["customerMenu"])
        } else {
          alert("Invalid Credentials...");
        }
      })
  }
  constructor(private _router : Router,  private _customerService : CustomerService){
    this.customer = new Customer();
    this.isValid = false;
  }
}
