import { HttpClient, HttpResponse } from '@angular/common/http';
import { ThrowStmt } from '@angular/compiler';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ICustomer } from './icustomer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  private _url="http://localhost:8080/cust";

  constructor(private http:HttpClient) { }

  public getallCustomer():Observable<ICustomer[]>
  {
    return this.http.get<ICustomer[]>(this._url);
  }

  public getCustomerById(id:string):Observable<ICustomer>
  {
    return this.http.get<ICustomer>(this._url+"/find/"+id);
  }
  public save(C:ICustomer):Observable<any>
  {
    const headers= {'content-type':'application/json','Accept':'text/plain'};
    return this.http.post<any>(this._url+"/save",C,{headers,responseType:'text' as 'json'});
  }

  
}
