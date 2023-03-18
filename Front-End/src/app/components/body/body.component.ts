import { Component, OnInit } from '@angular/core';
import { persona } from 'src/app/model/persona.model';
import { PersonaService } from 'src/app/persona.service';
import { SExperienceService } from 'src/app/Services/s-experience.service';

@Component({
  selector: 'app-body',
  templateUrl: './body.component.html',
  styleUrls: ['./body.component.css']
})
export class BodyComponent  implements OnInit {
  persona: persona = new persona('', '','');
  experience: BodyComponent[] = [];


constructor(public personaService: PersonaService, private sExperience: SExperienceService, private
  tokenService: TokenService) {} 
  isLogged = false;

  ngOnInit (): void{
   this.cargarExperience();
    this.personaService.getPersona().subscribe(data=>
      {this.persona = data})


  if (this.tokenService.getToken()){
    this.isLogged =true;
  } else {
    this.isLogged=false;
  }
}
cargarExperience():void{
  this.SExperience.lista().subscribe(
    data=> Experience = data;
  )
}
}

