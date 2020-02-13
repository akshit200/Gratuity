import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TableService {
  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };
  private tasksUrl = "http://localhost:8080";
  constructor(private http: HttpClient) { }
 
  public addTask(task): Observable<any> {
    console.log(task.n_name);
    const url =`${this.tasksUrl}/todo/api/updateData/1?n_name=${task.n_name}&n_address=${task.n_address}&n_dob=${task.n_dob}&n_relation=${task.n_relation}&n_amount=${task.n_amount}`;
    return this.http.put(url, null);
  }
}
