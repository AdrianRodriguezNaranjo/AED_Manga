import { Component, OnInit } from '@angular/core';
import { MymangasServiceService } from '../services/mymangas.service';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-my-mangas',
  templateUrl: './my-mangas.page.html',
  styleUrls: ['./my-mangas.page.scss'],
})
export class MyMangasPage implements OnInit {

  mangaName!: String;
  mangaSynopsis!: String;
  mangaChapter!: number;
  mangas: any = []

  constructor(private mymangasService: MymangasServiceService, private router: Router) { }

  ionViewWillEnter() {
    this.getAllMangas();
  }

  ngOnInit() {
    this.getAllMangas();
  }

  getAllMangas() {
    this.mymangasService.getAll(localStorage.getItem("userId")).subscribe(response => {
      this.mangas = response;
    });
  }

  postManga() {
    if(this.mangaName){
      this.mymangasService.post(this.mangaName, localStorage.getItem("userId")).subscribe(response => {
        this.getAllMangas();
      });
    }
  }

  deleteManga(idManga: any) {
    this.mymangasService.delete(idManga, localStorage.getItem("userId")).subscribe(response => {
      this.getAllMangas();
    });
  }

  updateManga(idManga: any) {
    this.mymangasService.put(localStorage.getItem("userId"), idManga, this.mangaName).subscribe(response => {
      this.getAllMangas();
    });
  }

  gotoHome() {
    this.router.navigateByUrl("/home");
  }

  gotoDetails(idManga: any) {
    localStorage.setItem("id",idManga);
    this.router.navigateByUrl("/manga-details");
  }
}
