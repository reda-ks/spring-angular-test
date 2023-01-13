import { TestBed } from '@angular/core/testing';

import { OrdreServiceService } from './ordre-service.service';

describe('OrdreServiceService', () => {
  let service: OrdreServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(OrdreServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
