import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { GreetingDataService } from '../services/data/GreetingData.service';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

  message = ""
  messageWs = '';

  constructor(
    private route: ActivatedRoute,
    private greetingDataService: GreetingDataService
  ) { }

  user = '';

  ngOnInit(): void {
    this.message = "Welcome!!!";
    //this.message = 1;

    this.user = this.route.snapshot.params['username'];
    console.log(this.message);
  }

  getGreeting() {

    /*
    this.greetingDataService.getGreeting().subscribe(
     response => this.handleResponse(response) 
    )
    */
    
    this.greetingDataService.getGreetingByName(this.user).subscribe(
      response => this.messageWs = response.toString(),
      
      error => this.messageWs = error.error.message
      
     )
  }

  handleResponse(response: Object) {
    this.messageWs = response.toString();
  }

}
