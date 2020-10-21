import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { ICustomer } from '../icustomer';

@Component({
  selector: 'app-customerbyid',
  templateUrl: './customerbyid.component.html',
  styleUrls: ['./customerbyid.component.css']
})
export class CustomerbyidComponent implements OnInit {

  public customer:ICustomer;
  constructor(private _service:CustomerService) { }


  ngOnInit(): void {
  }

  public custById(id:string)
  {
    this._service.getCustomerById(id).subscribe(data=>this.customer=data);
  }

  
}
