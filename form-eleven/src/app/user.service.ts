import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';
import { Observable, of, from } from 'rxjs';
import { User } from '../app/user';
@Injectable({
  providedIn: 'root'
})
export class UserService {

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  private userUrl = 'http://localhost:4040/todo'; // change this path with your backend machine name

  constructor(
    private http: HttpClient
  ) { }

   public getUser(): Observable<any> {
    //http://localhost:8080/todo/api/getData

     const url = `${this.userUrl}/api/getData`;
     console.log('>>>>>' + url);
     return this.http.get(url);
   }

  // tslint:disable-next-line: max-line-length
  public addUser(user: { firstName: any; lastName: any; dob: any; gender: any; contact_Number: any; email_Id: any; password: any; confirm_password: any; }): Observable<any> {
    // tslint:disable-next-line: max-line-length
    //const url = `${this.userUrl}/api/hr_Portal/createTask?firstName=${user.firstName}&lastName=${user.lastName}&dob=${user.dob}&gender=${user.gender}&contact_Number=${user.contact_Number}&email_Id=${user.email_Id}&password=${user.password}&confirm_password=${user.confirm_password}`;
    //http://localhost:8080/todo/api/updateData/2?n_name=Bhuwan&n_address=RZ-42&n_dob=27%2F01%2F1998&n_relation=FWB&n_amount=2121
    const url = `${this.userUrl}/api/updateData/${user.id}?firstName=${user.firstName}&lastName=${user.lastName}&dob=${user.dob}&gender=${user.gender}&contact_Number=${user.contact_Number}&email_Id=${user.email_Id}`;
    return this.http.put(url, null);
  }
}
