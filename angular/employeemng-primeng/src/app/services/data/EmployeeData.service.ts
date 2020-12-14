import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { environment } from '../../../environments/environment';
import { Observable } from 'rxjs';
import { Employee } from 'src/app/domain/Employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeDataService {

  constructor(private httpClient:HttpClient) { }

  getEmployeesByRole(role: string) {
    return this.httpClient.get<Employee[]>(`${environment.API_URL}/employees/${role}`);
  }

  getEmployeeByName(name: string) {
    return this.httpClient.get<Employee>(`${environment.API_URL}/employees/${name}`);
  }

}
