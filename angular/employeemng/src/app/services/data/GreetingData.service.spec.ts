/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { GreetingDataService } from './GreetingData.service';

describe('Service: GreetingData', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [GreetingDataService]
    });
  });

  it('should ...', inject([GreetingDataService], (service: GreetingDataService) => {
    expect(service).toBeTruthy();
  }));
});
