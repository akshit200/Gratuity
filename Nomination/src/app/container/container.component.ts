import { Component, OnInit } from '@angular/core';
import {NominationService} from "../nomination.service";
import {Nomination} from "../nomination";

@Component({
  selector: 'app-container',
  templateUrl: './container.component.html',
  styleUrls: ['./container.component.css']
})
export class ContainerComponent implements OnInit {
 
  nominations: Nomination[];
 
  constructor(private nominationService: NominationService) {
  //this.nomination=new Nomination();
  }
 
  ngOnInit() {
    this.nominationService.findAll().subscribe(data => {
      console.log(data);
      this.nominations = data;
      
  });
}
}