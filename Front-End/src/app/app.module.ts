import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { HeaderComponent } from './components/header/header.component';
import { BodyComponent } from './components/body/body.component';
import { MatSlideToggleModule } from '@angular/material/slide-toggle';
import { ProyectosComponent } from './components/body/proyectos/proyectos.component';
import { FooterComponent } from './components/body/footer/footer.component';
import { SnakeComponent } from './components/body/proyectos/snake/snake.component';
import { LoginComponent } from './components/login/login.component';
import { HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './components/home/home.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatSlideToggleModule,
    NgCircleProgressModule.forRoot({
      "maxPercent": 100,
      "showTitle": true,
      "showUnits": false,
      "showBackground": true
    }),
    HttpClientModule,
    FormsModule
  ],
  declarations: [
    AppComponent,
    HeaderComponent,
    BodyComponent,
    ProyectosComponent,
    FooterComponent,
    SnakeComponent,
    LoginComponent,
    HomeComponent,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule { }
