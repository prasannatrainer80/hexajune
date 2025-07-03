import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployPaginatorSortComponent } from './employ-paginator-sort.component';

describe('EmployPaginatorSortComponent', () => {
  let component: EmployPaginatorSortComponent;
  let fixture: ComponentFixture<EmployPaginatorSortComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EmployPaginatorSortComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmployPaginatorSortComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
