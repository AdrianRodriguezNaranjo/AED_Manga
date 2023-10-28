import { ComponentFixture, TestBed } from '@angular/core/testing';
import { MyMangasPage } from './my-mangas.page';

describe('MyMangasPage', () => {
  let component: MyMangasPage;
  let fixture: ComponentFixture<MyMangasPage>;

  beforeEach(async(() => {
    fixture = TestBed.createComponent(MyMangasPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
