import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EpsNominationComponent } from './eps-nomination.component';

describe('EpsNominationComponent', () => {
  let component: EpsNominationComponent;
  let fixture: ComponentFixture<EpsNominationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EpsNominationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EpsNominationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
