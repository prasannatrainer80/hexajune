import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VendorInfoComponent } from './vendor-info.component';

describe('VendorInfoComponent', () => {
  let component: VendorInfoComponent;
  let fixture: ComponentFixture<VendorInfoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [VendorInfoComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(VendorInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
