import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployDeleteComponent } from './employ-delete.component';

describe('EmployDeleteComponent', () => {
  let component: EmployDeleteComponent;
  let fixture: ComponentFixture<EmployDeleteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EmployDeleteComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmployDeleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
