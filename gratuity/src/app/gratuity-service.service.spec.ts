import { TestBed } from '@angular/core/testing';

import { GratuityServiceService } from './gratuity-service.service';

describe('GratuityServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: GratuityServiceService = TestBed.get(GratuityServiceService);
    expect(service).toBeTruthy();
  });
});
