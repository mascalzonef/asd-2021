import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-infobanner',
  templateUrl: './infobanner.component.html',
  styleUrls: ['./infobanner.component.css']
})
export class InfobannerComponent implements OnInit {

  constructor() { }

  @Input() message = '';
  @Input() username = '';
  @Input() showUsername = false;

  ngOnInit() {
  }

}
