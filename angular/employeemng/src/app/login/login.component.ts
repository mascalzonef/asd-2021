import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username:string = "ciccio";
  password:string = "";
  isAuthenticate = true;
  errorMessage = "Error! Username or Password not valid!";

  showMessages = false;
  infoMessage = "Access Allowed"

  constructor(
    private route : Router
  ) { }

  ngOnInit() {
  }

  doLogin() {
    console.log(this.username + " " + this.password);
    this.showMessages = true;
    if(this.username === "ciccio" && this.password === "123") {
      this.isAuthenticate = true;
      this.route.navigate(['welcome', this.username]);
    }
    else {
      this.isAuthenticate = false;
    }
  }

}
