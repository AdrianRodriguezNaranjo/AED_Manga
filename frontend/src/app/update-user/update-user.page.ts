import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.page.html',
  styleUrls: ['./update-user.page.scss'],
})
export class UpdateUserPage implements OnInit {

  userName!: String;
  userPassword!: String;
  userEmail!: String;

  constructor(private userService:UserService,private router: Router) { }

  ngOnInit() {
    this.getUser();
  }

  putUser() {
    this.userService.put(localStorage.getItem("userId"),this.userName, this.userPassword, this.userEmail).subscribe(response => {
      this.gotoHome();
    });
  }

  gotoHome(){
    this.router.navigateByUrl("/home");
  }

  getUser(){
    this.userService.get(localStorage.getItem("userId")).subscribe((response : any ) => {
      this.userName = response.name;
      this.userPassword = response.password;
      this.userEmail = response.email;
    });
  }
}
