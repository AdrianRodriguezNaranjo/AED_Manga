import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';
import { MangadetailsService } from '../services/mangadetails.service';

@Component({
  selector: 'app-manga-details',
  templateUrl: './manga-details.page.html',
  styleUrls: ['./manga-details.page.scss'],
})
export class MangaDetailsPage implements OnInit {

  constructor(private mangaDetailsService: MangadetailsService, private router: Router) { }

  details: any;
  mangaSynopsis!: String;
  mangaChapter!: number;
  mangaSynopsisAdd!: String;
  mangaChapterAdd!: number;

  ionViewWillEnter() {
    this.get();
  }
  
  ngOnInit() {
    this.get();
  }

  goBack() {
    this.router.navigateByUrl("/my-mangas");
  }

  get() {
    this.mangaDetailsService.get(localStorage.getItem("id")).subscribe(response => {
      this.details = response;
      if(this.details){
        this.mangaSynopsis = this.details.synopsis;
        this.mangaChapter = this.details.chapter;
      }
    });
  }

  deleteDetails() {
    this.mangaDetailsService.delete(localStorage.getItem("id")).subscribe(response => {
      this.get();
    });
  }

  updateDetails() {
    this.mangaDetailsService.put(localStorage.getItem("id"), this.mangaSynopsis, this.mangaChapter).subscribe(response => {
      this.get();
    });
  }

  postDetails() {
    if (this.mangaSynopsisAdd && this.mangaChapterAdd) {
      this.mangaDetailsService.post(this.mangaSynopsisAdd, this.mangaChapterAdd, localStorage.getItem("id")).subscribe(response => {
        this.get();
      });
    }
  }
}
