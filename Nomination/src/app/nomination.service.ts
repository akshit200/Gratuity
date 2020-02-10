import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Nomination } from './nomination';
 
@Injectable({
  providedIn: 'root'
})
export class NominationService {
  private nominationsUrl: string;
  constructor(private http: HttpClient) { 
    this.nominationsUrl = 'http://localhost:8080/todo/api/getData';
  
  }
  public findAll(): Observable<Nomination[]> {
    return this.http.get<Nomination[]>(this.nominationsUrl);
  }
}
