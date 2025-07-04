import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SecurePageComponent } from './secure-page.component';

describe('SecurePageComponent', () => {
  let component: SecurePageComponent;
  let fixture: ComponentFixture<SecurePageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SecurePageComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SecurePageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
