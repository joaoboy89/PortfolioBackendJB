/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package terceraapi.eslatercera.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import terceraapi.eslatercera.Model.Persona;

/**
 *
 * @author HP
 */

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    
}
