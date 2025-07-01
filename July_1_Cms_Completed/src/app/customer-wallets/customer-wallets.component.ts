import { Component } from '@angular/core';
import { WalletService } from '../wallet.service';
import { Wallet } from '../wallet';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-customer-wallets',
  standalone: true,
  imports: [CommonModule, FormsModule, RouterModule],
  templateUrl: './customer-wallets.component.html',
  styleUrl: './customer-wallets.component.css'
})
export class CustomerWalletsComponent {
  
  cid : number;
  wallet : Wallet[];
  constructor(private _walletService : WalletService) {
    this.cid = parseInt(localStorage.getItem("cid"));
    this._walletService.showCustomerWallet(this.cid).subscribe(x => {
      this.wallet = x;
    })
  }
}
