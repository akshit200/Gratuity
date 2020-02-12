import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Nomination } from './nomination';
// import { Table } from './table';
 
@Injectable({
  providedIn: 'root'
})
 
export class NominationService {
  private nominationsUrl: string;
   private usersUrl:string;
  constructor(private http: HttpClient) { 
    this.nominationsUrl = 'http://localhost:8080/todo/api/getData';
    // this.usersUrl = 'http://localhost:8080/todo/api/updateData';
  
  }
  public findAll(): Observable<Nomination[]> {
    return this.http.get<Nomination[]>(this.nominationsUrl);
  }
  // public save(user: Table) {
  //   return this.http.post<Table>(this.usersUrl, Table);
  // }
 
  // createTraveller(nomination: Nomination){
  //   return this.http.post(`${DATA_ACCESS_PREFIX}`, nomination);
  // }
}