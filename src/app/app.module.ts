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
    })
  ],
  declarations: [
    AppComponent,
    HeaderComponent,
    BodyComponent,
    ProyectosComponent,
    FooterComponent,
    SnakeComponent,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule { }
