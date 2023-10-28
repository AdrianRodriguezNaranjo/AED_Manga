import { TestBed } from '@angular/core/testing';

import { MymangasServiceService } from './mymangas.service';

describe('MymangasServiceService', () => {
  let service: MymangasServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MymangasServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
