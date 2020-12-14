import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot } from '@angular/router';
import { Router } from '@angular/router';
import { AuthServiceService } from '../services/AuthService.service';

@Injectable({
  providedIn: 'root'
})
export class RouteGuardServiceService implements CanActivate {

  constructor(private authService: AuthServiceService, private route: Router) { }

  canActivate(route: ActivatedRouteSnapshot, state:  RouterStateSnapshot)  {
    console.log(this.authService.isLogged())
    if (!this.authService.isLogged())
    {
      this.route.navigate(['login']);
      return false;
    }
    else 
    {
      return true;
    }
  }

}
