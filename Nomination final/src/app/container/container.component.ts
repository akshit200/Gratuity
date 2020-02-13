import { Component, OnInit } from '@angular/core';
// import{ Table } from '../table';
import {NominationService} from "../nomination.service";
import {Nomination} from "../nomination";
import { Table } from '../table';
import { TableService } from '../table.service';


@Component({
  selector: 'app-container',
  templateUrl: './container.component.html',
  styleUrls: ['./container.component.css']
})


export class ContainerComponent implements OnInit {
  table=new Table();
  dataarray=[];
  task = {};
  nominations: Nomination[];
 
  constructor(private nominationService: NominationService, private tableService: TableService) {
  //this.nomination=new Nomination();
  }
 
  // constructor( ){}
  // Table = new Table();
  // dataarray=[];
    containers = [];
// onSubmit(){
// console.log("hello");
// }
// onSubmit(){
  // let table:Table = {
  //   n_name: this.n_name,
  //   n_address: this.n_address
    // lastName: this.lastName,
    // age: this.age,
    // city: this.city,
    // country: this.country
  // };
// uses instance of data access service to call createTraveller function   
// this.dataAccess.createTraveller(traveller)
//     .subscribe(
//       success => alert("Done"),
//       error => alert(error)
//     );

  
  ngOnInit() {
    {
      this.nominationService.findAll().subscribe(data => {
        console.log(data);
        this.nominations = data;
        
    });
  }
    this.dataarray.push(this.table);
  }
  
  onSubmit(){
    
     this.dataarray.push(this.table);
     
   }
  // remform1(index:any){
    
  //   this.dataarray.pop();
  // }

  add(){
    this.containers.push(this.containers.length);
  }

  remove(){
    
    this.containers.pop();
  }
  addTask(n_name, n_address, n_relation, n_dob, n_amount){
    this.task = {
      "n_name": n_name, 
      "n_address": n_address, 
      "n_relation": n_relation, 
      "n_dob": n_dob, 
      "n_amount": n_amount
    }
    this.tableService.addTask(this.task).subscribe(data=> {

    });
  }
}

