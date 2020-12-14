import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MenuItem, MessageService } from 'primeng/api';
import { Employee } from '../domain/Employee';
import { AuthServiceService } from '../services/AuthService.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
  providers: [MessageService]
})
export class HomeComponent implements OnInit {

  constructor(
    private route: Router,
    private authService: AuthServiceService,
    private messageService: MessageService
    
    ) { }

  items: MenuItem[] = [];

  isFirst: boolean = true;
  activeItem: MenuItem | undefined;

  ngOnInit() {
    
    this.items = [
        {label: 'Home', icon: 'pi pi-fw pi-home'},
        {label: 'Calendar', icon: 'pi pi-fw pi-calendar'},
        {label: 'Documentation', icon: 'pi pi-fw pi-file'},
        {label: 'Settings', icon: 'pi pi-fw pi-cog'},
        {label: 'Logout', icon: 'pi pi-fw pi-sign-in', command: (event) =>{this.logout()}}
    ];

    this.activeItem = this.items[0];
    
  }

  logout() {
    this.authService.clearAll();
    this.route.navigate(['login']);
  }

  showSuccess()
  {
    if(this.isFirst)
      this.messageService.add({severity:'success', summary: 'Login Success', detail: 'Welcome ' + this.authService.loggedUser()});
    this.isFirst = false;
  }

  employeeInputRole: string = "";
  employeeInputName: string = "";
  onEditEmployee(employee: Employee) {
    this.employeeInputRole =  employee.role;
    this.employeeInputName =  employee.name;
  }
}
