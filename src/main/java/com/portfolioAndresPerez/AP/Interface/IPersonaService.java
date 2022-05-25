package com.portfolioAndresPerez.AP.Interface;

import com.portfolioAndresPerez.AP.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una lista de personas//
    public List<Persona> getPersona();
    
    //Guardar un objeto//
    public void savePersona(Persona persona);
    
    //Eliminar usuario//
    public void deletePersona(Long Id);
    
    //Buscar persona//
    public Persona findPersona (Long Id);
}
