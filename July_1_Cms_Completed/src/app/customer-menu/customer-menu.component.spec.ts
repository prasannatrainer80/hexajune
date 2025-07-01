import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerMenuComponent } from './customer-menu.component';

describe('CustomerMenuComponent', () => {
  let component: CustomerMenuComponent;
  let fixture: ComponentFixture<CustomerMenuComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CustomerMenuComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CustomerMenuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
