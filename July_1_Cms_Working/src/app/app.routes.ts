import { Routes } from '@angular/router';
import { CustomerLoginComponent } from './customer-login/customer-login.component';
import { CustomerMenuComponent } from './customer-menu/customer-menu.component';
import { CustomerInfoComponent } from './customer-info/customer-info.component';
import { CustomerWalletsComponent } from './customer-wallets/customer-wallets.component';
import { CustomerOrdersComponent } from './customer-orders/customer-orders.component';
import { CustomerPendingOrdersComponent } from './customer-pending-orders/customer-pending-orders.component';
import { PlaceOrderComponent } from './place-order/place-order.component';

export const routes: Routes = [
   {path:'',component:CustomerLoginComponent},
   {path:'customerMenu',component:CustomerMenuComponent},
   {path:'customerMenu',component:CustomerMenuComponent, children:
    [
        {path:'customerInfo',component:CustomerInfoComponent,outlet:'customer'},
        {path:'customerWallet',component:CustomerWalletsComponent,outlet:'customer'},
        {path:'customerOrders',component:CustomerOrdersComponent,outlet:'customer'},
        {path:'customerPendingOrders',component:CustomerPendingOrdersComponent,outlet:'customer'},
        {path:'placeOrder',component:PlaceOrderComponent,outlet:'customer'}
    ]
}
];
