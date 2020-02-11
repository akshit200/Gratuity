import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GratuityPdfComponent } from './gratuity-pdf.component';

describe('GratuityPdfComponent', () => {
  let component: GratuityPdfComponent;
  let fixture: ComponentFixture<GratuityPdfComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GratuityPdfComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GratuityPdfComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
