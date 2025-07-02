import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployAddComponent } from './employ-add.component';

describe('EmployAddComponent', () => {
  let component: EmployAddComponent;
  let fixture: ComponentFixture<EmployAddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EmployAddComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmployAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
