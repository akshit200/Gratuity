import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PfForm1Component } from './pf-form1.component';

describe('PfForm1Component', () => {
  let component: PfForm1Component;
  let fixture: ComponentFixture<PfForm1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PfForm1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PfForm1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
