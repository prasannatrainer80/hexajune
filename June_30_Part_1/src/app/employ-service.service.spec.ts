import { TestBed } from '@angular/core/testing';

import { EmployServiceService } from './employ-service.service';

describe('EmployServiceService', () => {
  let service: EmployServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EmployServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
