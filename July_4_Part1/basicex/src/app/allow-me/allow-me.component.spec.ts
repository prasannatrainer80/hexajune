import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllowMeComponent } from './allow-me.component';

describe('AllowMeComponent', () => {
  let component: AllowMeComponent;
  let fixture: ComponentFixture<AllowMeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AllowMeComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AllowMeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
