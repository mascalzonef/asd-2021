/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { RouteGuardServiceService } from './RouteGuardService.service';

describe('Service: RouteGuardService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [RouteGuardServiceService]
    });
  });

  it('should ...', inject([RouteGuardServiceService], (service: RouteGuardServiceService) => {
    expect(service).toBeTruthy();
  }));
});
