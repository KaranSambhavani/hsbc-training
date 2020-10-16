import { Component, OnInit } from '@angular/core';
import { empdata } from '../Emp';

@Component({
  selector: 'app-emp',
  templateUrl: './emp.component.html',
  styleUrls: ['./emp.component.css']
})
export class EmpComponent implements OnInit {

 public empList=empdata;

 public dataFlag=true;

  constructor() { }

  ngOnInit(): void {
  }

  public onClick(){
    this.dataFlag=false;
  }

}
