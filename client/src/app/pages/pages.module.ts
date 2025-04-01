import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CartComponent } from './cart/cart.component';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';



@NgModule({
  declarations: [
    AdminComponent,
    CartComponent,
    HomeComponent
  ],
  imports: [
    CommonModule
  ],
  exports : [
    AdminComponent,
    CartComponent,
    HomeComponent
  ]
})
export class PagesModule { }
