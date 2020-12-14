import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ErrorComponent } from './error/error.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { RouteGuardServiceService } from './services/RouteGuardService.service';

const routes: Routes = [
  {path:'', component : LoginComponent},
  {path:'login', component : LoginComponent},
  {path:'home/:username', component : HomeComponent, canActivate: [RouteGuardServiceService]},
  {path:'**', component : ErrorComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
