import { HttpClient, HttpHeaders} from '@angular/common/http';
import { Injectable } from '@angular/core';

const endPoint = "http://localhost:8080/mangas";
const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/x-www-form-urlencoded'
  })
};

@Injectable({
  providedIn: 'root'
})
export class MymangasServiceService {

  constructor(private httpClient: HttpClient) { }

  getAll(userId: any){
    return this.httpClient.get(endPoint+"/users/"+userId);
  }

  post(mangaName: any,userId: any){
    let body = new URLSearchParams();
    body.append("name",mangaName);
    return this.httpClient.post(endPoint+"/users/"+userId,body,httpOptions);
  }

  delete(idManga: any,userId: any){
    return this.httpClient.delete(endPoint+"/"+idManga+"/users/"+userId,httpOptions);
  }

  put(userId: any,idManga: any,mangaName: any){
    let body = new URLSearchParams();
    body.append("idManga",idManga);
    body.append("name",mangaName);
    return this.httpClient.put(endPoint+"/"+idManga+"/users/"+userId,body,httpOptions)
  }
}
