import { TestBed } from '@angular/core/testing';

import { LeaveHistoryService } from './leave-history.service';

describe('LeaveHistoryService', () => {
  let service: LeaveHistoryService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LeaveHistoryService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
