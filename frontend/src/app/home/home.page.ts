import { Component } from '@angular/core';
import { Route, Router } from '@angular/router';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  users: any = []

  constructor(private userService:UserService,private router: Router) { }

  ionViewWillEnter() {
    this.getAllUsers();
  }

  ngOnInit() {
    this.getAllUsers();
  }

  getAllUsers() {
    this.userService.getAll().subscribe(response => {
      this.users = response;
    });
  }

  gotoMyMangas(userId: any) {
    localStorage.setItem("userId",userId);
    this.router.navigateByUrl("/my-mangas");
  }

  gotoCreateUser() {
    this.router.navigateByUrl("/create-user");
  }

  deleteUser(userId: any){
    this.userService.delete(userId).subscribe(response => {
      this.getAllUsers();
    });
  }

  gotoPutUser(userId: any){
    localStorage.setItem("userId",userId);
    this.router.navigateByUrl("/update-user");
  }
}
