import { Component, OnInit } from '@angular/core';
import {  UserService } from '../user.service';
import { first } from 'rxjs/operators';
import { Router } from '@angular/router';
import { User } from '../user';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  //[x: string]: any;

  isDisabled=true;
  textBoxevent(){
    this.isDisabled=!this.isDisabled;
    return;
  }


  submitted = false;

  newUser = {
    firstName: ' ',
    lastName: '',
    dob: '',
    gender: '',
    contact_Number: '',
    email_Id: '',
    password: '',
    confirm_password: '',

  };
  userList = [];

  constructor(
    private userService: UserService,
    public router:Router
    ) { }

    ngOnInit() {
    }

    onSubmit(userFrom) {
      if (userFrom.invalid) {
        return;
      }
      this.userService.addUser(this.newUser)
     // .pipe(first())
      .subscribe((res) => {
        if (res) {
          this.userList = res;
          this.router.navigate(['/']);
          this.submitted = true;
        } else {
          console.log('fail');
        }
      });

    }

  }
