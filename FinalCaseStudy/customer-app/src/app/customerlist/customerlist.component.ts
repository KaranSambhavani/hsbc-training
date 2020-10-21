import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { ICustomer } from '../icustomer';

@Component({
  selector: 'app-customerlist',
  templateUrl: './customerlist.component.html',
  styleUrls: ['./customerlist.component.css']
})
export class CustomerlistComponent implements OnInit {

  public list:ICustomer[];
  constructor(private _service:CustomerService) { }

  ngOnInit(): void {
  }

  public listAll()
  {
    this._service.getallCustomer().subscribe(data=>this.list=data);
  }
}
