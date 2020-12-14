import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthServiceService } from '../services/AuthService.service';
import {MessageService} from 'primeng/api';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'],
  providers: [MessageService]
})
export class LoginComponent implements OnInit {

  constructor(
    private route: Router,
    private authService: AuthServiceService,
    private messageService: MessageService
  ) { }

  username: string = "";
  password: string = "";
  
  isAuthenticate: Boolean = false;

  ngOnInit() {
  }

  doLogin() {
    this.authService.authenticate(this.username, this.password).subscribe(
      response => {
        
        if(response==true) {
          sessionStorage.setItem("user", this.username);
          this.isAuthenticate = true;
          this.route.navigate(['home', this.username]);
      }
      else {
          this.isAuthenticate = false;
          this.messageService.add({key: 'tc', severity:'error', summary: 'Error', detail: 'Bad username or password'});
        }
      }
    )
  }
}
