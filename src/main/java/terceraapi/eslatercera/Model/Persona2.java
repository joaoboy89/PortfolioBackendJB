/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terceraapi.eslatercera.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author HP
 */
@Getter @Setter
@Entity
public class Persona2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String usuario;
    private String password;
    private String email;
    
    public Persona2() {}

    
    public Persona2 (Long id, String usuario, String password, String email){
        
        this.id = id;
        this.usuario = usuario;
        this.password = password;
        this.email = email;
    };
    
    
        public String getPassword() {
        return password;
    }

        public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}

