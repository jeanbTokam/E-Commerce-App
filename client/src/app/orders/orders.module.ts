import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { OrderDetailsComponent } from './order-details/order-details.component';
import { OrderFormComponent } from './order-form/order-form.component';
import { OrderListComponent } from './order-list/order-list.component';



@NgModule({
  declarations: [
    OrderDetailsComponent,
    OrderFormComponent,
    OrderListComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    OrderDetailsComponent,
    OrderFormComponent,
    OrderListComponent
  ]
})
export class OrdersModule { }
