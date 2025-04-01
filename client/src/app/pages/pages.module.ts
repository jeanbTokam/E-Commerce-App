import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdminComponent } from './admin/admin/admin.component';
import { CartComponent } from './cart/cart.component';
import { HomeComponent } from './home/home.component';



@NgModule({
  declarations: [
    AdminComponent,
    CartComponent,
    HomeComponent
  ],
  imports: [
    CommonModule
  ]
})
export class PagesModule { }
