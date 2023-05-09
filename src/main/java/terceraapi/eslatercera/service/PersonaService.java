 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terceraapi.eslatercera.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import terceraapi.eslatercera.Model.Persona;
import terceraapi.eslatercera.repository.PersonaRepository;

/**
 *
 * @author HP
 */


@Service
public class PersonaService implements IPersonaService {

    @Autowired 
    public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    } 

    @Override
    public void crearPersona(Persona pers) {
        persoRepo.save(pers);
    }

    @Override
    public void borrarPersona(long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(long id) {
     return persoRepo.findById(id).orElse(null);

    }  
         
    
    
    
}
