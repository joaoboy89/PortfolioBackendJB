/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terceraapi.eslatercera.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import terceraapi.eslatercera.Model.Persona2;
import java.util.Optional;



/**
 *
 * @author HP
 */
@Repository
public interface UserRepository extends JpaRepository<Persona2, Long> {
    
    Optional<Persona2> findByEmail (String username);

}
