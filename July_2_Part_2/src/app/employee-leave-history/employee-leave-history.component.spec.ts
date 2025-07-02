import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeLeaveHistoryComponent } from './employee-leave-history.component';

describe('EmployeeLeaveHistoryComponent', () => {
  let component: EmployeeLeaveHistoryComponent;
  let fixture: ComponentFixture<EmployeeLeaveHistoryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EmployeeLeaveHistoryComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmployeeLeaveHistoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
