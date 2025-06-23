import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TwoWayComponent } from './two-way.component';

describe('TwoWayComponent', () => {
  let component: TwoWayComponent;
  let fixture: ComponentFixture<TwoWayComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TwoWayComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TwoWayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
