import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MatTableExComponent } from './mat-table-ex.component';

describe('MatTableExComponent', () => {
  let component: MatTableExComponent;
  let fixture: ComponentFixture<MatTableExComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MatTableExComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MatTableExComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
