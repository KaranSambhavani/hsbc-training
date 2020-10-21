import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CostomersaveComponent } from './costomersave.component';

describe('CostomersaveComponent', () => {
  let component: CostomersaveComponent;
  let fixture: ComponentFixture<CostomersaveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CostomersaveComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CostomersaveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
