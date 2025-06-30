import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployFormComponent } from './employ-form.component';

describe('EmployFormComponent', () => {
  let component: EmployFormComponent;
  let fixture: ComponentFixture<EmployFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EmployFormComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmployFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
