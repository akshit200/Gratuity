import { Component, OnInit } from '@angular/core';
// import{ Table } from '../table';
import {NominationService} from "../nomination.service";
import {Nomination} from "../nomination";
// import { Table } from '../table';
// import { TableService } from '../table.service';
import{Router} from '@angular/router';


@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})

export class FirstComponent implements OnInit {
  // table=new Table();
  dataarray=[];
  task = {};
  nominations: Nomination[];
  containers=[];
  rout=false;
  // constructor(
  //   public router: Router
  // ) { }
 
  constructor(private nominationService: NominationService ,public router: Router) {
  //this.nomination=new Nomination();
  
  }
 
  // constructor( ){}
  // Table = new Table();
  // dataarray=[];
    // containers = [];
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
  onSubmit(){
    this.router.navigate(['/pf-form1']);
    this.rout=true;
  };
  
  // onSubmit(){
    
  //    this.dataarray.push(this.table);
     
  //  }
  // remform1(index:any){
    
  //   this.dataarray.pop();
  // }
 
  add(){
    this.containers.push(this.containers.length);
  }
 
  remove(){
    
    this.containers.pop();
  }
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
