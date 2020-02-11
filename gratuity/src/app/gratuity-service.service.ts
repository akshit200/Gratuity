import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
  
})

export class GratuityServiceService {

  
private gratuityUrl: string;
  constructor(private http:HttpClient) {
    this.gratuityUrl = 'http://localhost:8080/users';
   }
 
}
