/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package terceraapi.eslatercera.service;

import java.util.List;
import terceraapi.eslatercera.Model.Persona;

/**
 *
 * @author HP
 */


public interface IPersonaService {
    
    
    public List <Persona> verPersonas();
    public void crearPersona (Persona pers);
    public void borrarPersona (long id);
    public Persona buscarPersona (long id);
}
