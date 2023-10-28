import { TestBed } from '@angular/core/testing';

import { MangadetailsService } from './mangadetails.service';

describe('MangadetailsService', () => {
  let service: MangadetailsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MangadetailsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
