import { Component, OnInit } from '@angular/core';
import { EmployeeDataServiceService } from '../services/data/EmployeeDataService.service';

export class Employee {
  constructor(
    public id: number,
    public name: string,
    public role: string,
    public hireDate: Date,
    public active: boolean,
  ){ }
}

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  employees= [
    {id:  1, name: 'employee 1', role : 'IMP', hireDate: '2010-01-01', active: true },
    {id:  2, name: 'employee 2', role : 'IMP', hireDate: '2010-07-01', active: false},
    {id:  3, name: 'employee 3', role : 'DIR', hireDate: '2008-01-08', active: true},
    {id:  4, name: 'employee 4', role : 'SEG', hireDate: '2010-07-30', active: false}
  ];

  employeesObj= [
    new Employee(1, 'employee 1', 'IMP', new Date('2010-01-01'), true),
    new Employee(2, 'employee 2', 'IMP', new Date('2010-07-01'), false),
    new Employee(3, 'employee 3', 'DIR', new Date('2008-01-08'), true),
    new Employee(4, 'employee 4', 'SEG', new Date('2010-07-30'), false)
  ];

  employeesList: Employee[] = [];

  constructor(private employeeDataService: EmployeeDataServiceService) { }

  ngOnInit() {
    this.employeeDataService.getAllEmployee().subscribe(
      response => {
        console.log(response)
        this.employeesList = response;
      }
    )
  }

}
