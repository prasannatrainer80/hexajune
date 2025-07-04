import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AuthServiceComponent } from './auth-service.component';

describe('AuthServiceComponent', () => {
  let component: AuthServiceComponent;
  let fixture: ComponentFixture<AuthServiceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AuthServiceComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AuthServiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
