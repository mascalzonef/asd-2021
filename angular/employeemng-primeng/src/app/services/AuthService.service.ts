import { Injectable } from '@angular/core';
import { LoginDataService } from './data/LoginData.service';

@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {

  constructor(
    private loginDataService: LoginDataService
  ) { }

  authenticate = (username: string, password: string) => {
    return this.loginDataService.login(username, password);
  }

  loggedUser = () => {
    let utente = sessionStorage.getItem("user");
    return (sessionStorage.getItem("user") != null) ? utente : "";
}

isLogged = () => (sessionStorage.getItem("user") != null) ? true : false;


clearAll = () => sessionStorage.removeItem("user");

}
