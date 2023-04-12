/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terceraapi.eslatercera.Controler;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import terceraapi.eslatercera.Model.Persona;
import terceraapi.eslatercera.service.IPersonaService;

/**
 *
 * @author HP
 */
@RestController
public class Controler {
    
    @Autowired 
    private IPersonaService persoServ;
    
    @PostMapping ("/crear/persona")
    public void agregarPersona(@RequestBody Persona pers){
     persoServ.crearPersona(pers);
     
    }
    
    @GetMapping ("/ver/persona")
    @ResponseBody
    public List <Persona> verPersonas() {
    return persoServ.verPersonas();
    }
    
    @GetMapping ("/mensaje")
    public ResponseEntity <String> mensajePrueba(){
        
    return ResponseEntity.ok("esta funcionando la app");
    }
    
    @DeleteMapping ("/borrar/{id}")
    public void borrarPersona (@PathVariable Long id){
    persoServ.borrarPersona(id);
    }
    
}
