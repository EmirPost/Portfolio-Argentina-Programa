import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, BehaviorSubject } from 'rxjs';
import { tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private loggedIn = new BehaviorSubject<boolean>(false);

  constructor(private http: HttpClient) {
    // check if user is already logged in on app initialization
    this.loggedIn.next(this.isLoggedIn());
  }

  isLoggedIn(): boolean {
    return !!localStorage.getItem('auth_token');
  }

  login(name: string, password: string): Observable<any> {
    return this.http.post<any>('/api/auth/login', { name, password }).pipe(
      tap(response => {
        if (response.access_token) {
          localStorage.setItem('auth_token', response.access_token);
          this.loggedIn.next(true);
        }
      })
    );
  }

  logout() {
    localStorage.removeItem('auth_token');
    this.loggedIn.next(false);
  }

  get isLoggedIn$() {
    return this.loggedIn.asObservable();
  }
}
