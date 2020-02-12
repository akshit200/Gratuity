import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EpfFormComponent } from './epf-form.component';

describe('EpfFormComponent', () => {
  let component: EpfFormComponent;
  let fixture: ComponentFixture<EpfFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EpfFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EpfFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
