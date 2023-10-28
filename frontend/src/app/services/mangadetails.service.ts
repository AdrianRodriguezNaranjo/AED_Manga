import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

const endPoint = "http://localhost:8080/mangadetails";
const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/x-www-form-urlencoded'
  })
};

@Injectable({
  providedIn: 'root'
})
export class MangadetailsService {

  constructor(private httpClient: HttpClient) { }

  get(idManga: any) {
    return this.httpClient.get(endPoint + "/" + idManga);
  }

  post(synopsis: any, chapter: any, idManga: any) {
    let body = new URLSearchParams();
    body.append("synopsis", synopsis);
    body.append("chapter", chapter);
    return this.httpClient.post(endPoint + "/mangas/" + idManga, body, httpOptions);
  }

  delete(idManga: any) {
    return this.httpClient.delete(endPoint + "/" + idManga, httpOptions);
  }

  put(idManga: any, synopsis: any, chapter: any) {
    let body = new URLSearchParams();
    body.append("synopsis", synopsis);
    body.append("chapter", chapter);
    return this.httpClient.put(endPoint + "/mangas/" + idManga, body, httpOptions)
  }
}
