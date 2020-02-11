import { Component, OnInit } from '@angular/core';
import{ Table } from '../table';


@Component({
  selector: 'app-container',
  templateUrl: './container.component.html',
  styleUrls: ['./container.component.css']
})


export class ContainerComponent  {
 
  constructor( ){}
  Table = new Table();
  dataarray=[];
  containers = [];

  
  ngOnInit() {
    this.dataarray.push(this.Table);
  }
  
  // addform1(){
    
  //   this.dataarray.push(this.Table);
  // }
  // remform1(index:any){
    
  //   this.dataarray.pop();
  // }

  add(){
    this.containers.push(this.containers.length);
  }

  remove(){
    
    this.containers.pop();
  }
  }

