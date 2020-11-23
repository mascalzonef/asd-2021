import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GreetingDataService {

  constructor(
    private httpClient:HttpClient) { }

  getGreeting() {
    const headers = new HttpHeaders().set('Content-Type', 'text/plain; charset=utf-8');
    return this.httpClient.get('http://localhost:8080/restex/greeting/ciccio', { headers, responseType: 'text'})
  }

  getGreetingByName(name: string) {
    const headers = new HttpHeaders().set('Content-Type', 'text/plain; charset=utf-8');
    return this.httpClient.get(`http://localhost:8080/restex/greeting/${name}`, { headers, responseType: 'text'})
    // ` -> ALT+0096 | ALTGR+'
  }

}
