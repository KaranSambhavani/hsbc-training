import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerService } from './customer.service';
import { CustomerlistComponent } from './customerlist/customerlist.component';
import { CustomerbyidComponent } from './customerbyid/customerbyid.component';
import { CostomersaveComponent } from './costomersave/costomersave.component';

@NgModule({
  declarations: [
    AppComponent,
    CustomerlistComponent,
    CustomerbyidComponent,
    CostomersaveComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [CustomerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
