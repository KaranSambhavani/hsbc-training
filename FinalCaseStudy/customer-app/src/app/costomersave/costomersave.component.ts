import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { ICustomer } from '../icustomer';

@Component({
  selector: 'app-costomersave',
  templateUrl: './costomersave.component.html',
  styleUrls: ['./costomersave.component.css']
})
export class CostomersaveComponent implements OnInit {

  public customer:ICustomer;
  public status:string;
  constructor(private _service:CustomerService) { }

  ngOnInit(): void {
  }

 public custSave(id:number,name:string,mobile:number)
 {
    this.customer={customerId:id,customerName:name,mobile:mobile};
    this._service.save(this.customer).subscribe(data=>this.status=data);

 }

}
