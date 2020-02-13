import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PfForm2Component } from './pf-form2.component';

describe('PfForm2Component', () => {
  let component: PfForm2Component;
  let fixture: ComponentFixture<PfForm2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PfForm2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PfForm2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
