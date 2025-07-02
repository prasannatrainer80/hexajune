import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MyManagerInfoComponent } from './my-manager-info.component';

describe('MyManagerInfoComponent', () => {
  let component: MyManagerInfoComponent;
  let fixture: ComponentFixture<MyManagerInfoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MyManagerInfoComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MyManagerInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
