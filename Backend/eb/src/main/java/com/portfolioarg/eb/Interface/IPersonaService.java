package com.portfolioarg.eb.Interface;

import com.portfolioarg.eb.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    //Treer lista de personas
    public List<Persona> getPersona ();
    
    //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un usuario por ID
    public void deletePersona(Long id);
    
    //Buscar una persona
    public Persona findPersona(Long id);
}
