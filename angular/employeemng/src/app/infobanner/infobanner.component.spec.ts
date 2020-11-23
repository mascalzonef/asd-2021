/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { InfobannerComponent } from './infobanner.component';

describe('InfobannerComponent', () => {
  let component: InfobannerComponent;
  let fixture: ComponentFixture<InfobannerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InfobannerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InfobannerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
