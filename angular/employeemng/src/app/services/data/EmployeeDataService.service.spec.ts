/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { EmployeeDataServiceService } from './EmployeeDataService.service';

describe('Service: EmployeeDataService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [EmployeeDataServiceService]
    });
  });

  it('should ...', inject([EmployeeDataServiceService], (service: EmployeeDataServiceService) => {
    expect(service).toBeTruthy();
  }));
});
