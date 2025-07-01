import { Routes } from '@angular/router';
import { CustomerLoginComponent } from './customer-login/customer-login.component';
import { CustomerMenuComponent } from './customer-menu/customer-menu.component';
import { CustomerInfoComponent } from './customer-info/customer-info.component';
import { CustomerWalletsComponent } from './customer-wallets/customer-wallets.component';
import { CustomerOrdersComponent } from './customer-orders/customer-orders.component';
import { CustomerPendingOrdersComponent } from './customer-pending-orders/customer-pending-orders.component';
import { PlaceOrderComponent } from './place-order/place-order.component';
import { HomeComponent } from './home/home.component';
import { VendorLoginComponent } from './vendor-login/vendor-login.component';
import { VendorMenuComponent } from './vendor-menu/vendor-menu.component';
import { VendorInfoComponent } from './vendor-info/vendor-info.component';
import { VendorOrdersComponent } from './vendor-orders/vendor-orders.component';
import { VendorPendingOrdersComponent } from './vendor-pending-orders/vendor-pending-orders.component';
import { VendorAcceptRejectComponent } from './vendor-accept-reject/vendor-accept-reject.component';

export const routes: Routes = [
   {path:'',component:HomeComponent},
   {path:'home',component:HomeComponent},
   {path:'customerLogin',component:CustomerLoginComponent},
   {path:'vendorLogin',component:VendorLoginComponent},
   {path:'vendorMenu',component:VendorMenuComponent},
   {path:'vendorMenu',component:VendorMenuComponent,children : [
     {path:'vendorInfo',component:VendorInfoComponent, outlet:'vendor'},
     {path:'vendorOrders',component:VendorOrdersComponent,outlet:'vendor'},
     {path:'vendorPendingOrders',component:VendorPendingOrdersComponent,
        outlet:'vendor'},
    {path:'vendorAcceptReject',component:VendorAcceptRejectComponent, outlet:'vendor'}
   ]},
   
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
