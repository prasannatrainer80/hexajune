import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VendorMenuComponent } from './vendor-menu.component';

describe('VendorMenuComponent', () => {
  let component: VendorMenuComponent;
  let fixture: ComponentFixture<VendorMenuComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [VendorMenuComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(VendorMenuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
