import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {
containers=[];
  rout=false;
  constructor(
    public router: Router
  ) { }

  ngOnInit() {
  }
  
  add(){
    this.containers.push(this.containers.length);
  };
 
  remove(){
    
    this.containers.pop();
  };
  onSubmit(){
    this.router.navigate(['/pf-form1']);
    this.rout=true;
  };

}
