/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { EmployeeDataService } from './EmployeeData.service';

describe('Service: EmployeeData', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [EmployeeDataService]
    });
  });

  it('should ...', inject([EmployeeDataService], (service: EmployeeDataService) => {
    expect(service).toBeTruthy();
  }));
});
