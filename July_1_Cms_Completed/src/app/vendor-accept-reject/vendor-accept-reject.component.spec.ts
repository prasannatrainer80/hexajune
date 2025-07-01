import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VendorAcceptRejectComponent } from './vendor-accept-reject.component';

describe('VendorAcceptRejectComponent', () => {
  let component: VendorAcceptRejectComponent;
  let fixture: ComponentFixture<VendorAcceptRejectComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [VendorAcceptRejectComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(VendorAcceptRejectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
