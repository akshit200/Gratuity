import { Component, OnInit } from '@angular/core';
import {NominationService} from "../nomination.service";
import {Nomination} from "../nomination";

@Component({
  selector: 'app-epf-form',
  templateUrl: './epf-form.component.html',
  styleUrls: ['./epf-form.component.css']
})
export class EpfFormComponent implements OnInit {

  nominations: Nomination[];
 
  constructor(private nominationService: NominationService) {
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
    // this.dataarray.push(this.table);
  }
  
  // onSubmit(){
    
  //    this.dataarray.push(this.table);
     
  //  }
  // remform1(index:any){
    
  //   this.dataarray.pop();
  // }
 
  // add(){
  //   this.containers.push(this.containers.length);
  // }
 
  // remove(){
    
  //   this.containers.pop();
  // }
  // addTask(n_name, n_address, n_relation, n_dob, n_amount){
  //   this.task = {
  //     "n_name": n_name, 
  //     "n_address": n_address, 
  //     "n_relation": n_relation, 
  //     "n_dob": n_dob, 
  //     "n_amount": n_amount
  //   }
  //   this.tableService.addTask(this.task).subscribe(data=> {
 
  //   });
  // }
}