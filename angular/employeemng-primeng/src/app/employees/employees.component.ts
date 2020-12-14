import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Employee } from '../domain/Employee';
import { EmployeeDataService } from '../services/data/EmployeeData.service';

@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css']
})
export class EmployeesComponent implements OnInit {

  employees: Employee[] = [];

  @Input() role: string = "";

  @Output('onEditEmployee') employeeToEdit = new EventEmitter;

  constructor(private employeeDataService: EmployeeDataService) { }

  ngOnInit() {
    this.employeeDataService.getEmployeesByRole(this.role).subscribe(
      response => this.employees = response
    )
  }

  editEmployee(employee: Employee) {
    this.employeeToEdit.emit(employee);
  }

}
