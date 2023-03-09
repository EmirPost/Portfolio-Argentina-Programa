import { Component } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  showLogin = false;

  toggleLogin() {
    this.showLogin = !this.showLogin;
  }

  onSubmit(loginData: any) {
    console.log(loginData);
  }
}
