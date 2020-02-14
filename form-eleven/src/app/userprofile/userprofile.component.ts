import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-userprofile',
  templateUrl: './userprofile.component.html',
  styleUrls: ['./userprofile.component.css']
})
export class UserprofileComponent implements OnInit {

  username="Vaibhav"
  constructor() { }

  ngOnInit() {
  }

  displayNav(){
    const userNav=document.querySelector(".user-profile-nav");
    userNav.classList.toggle("display");
  }
}
