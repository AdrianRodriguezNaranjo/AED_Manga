import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-create-user',
  templateUrl: './create-user.page.html',
  styleUrls: ['./create-user.page.scss'],
})
export class CreateUserPage implements OnInit {

  userName!: String;
  userPassword!: String;
  userEmail!: String;

  constructor(private userService:UserService,private router: Router) { }

  ngOnInit() {
  }

  postUser() {
    this.userService.post(this.userName, this.userPassword, this.userEmail).subscribe(response => {
      this.gotoHome();
    });
  }

  gotoHome(){
    this.router.navigateByUrl("/home");
  }
}
