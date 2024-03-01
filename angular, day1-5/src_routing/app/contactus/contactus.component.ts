import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-contactus',
  templateUrl: './contactus.component.html',
  styleUrls: ['./contactus.component.css']
})
export class ContactusComponent {

  name:string='';
  constructor(private router:ActivatedRoute) { 
   router.params.subscribe(params=>this.name=params['username']);

  }
}
