/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terceraapi.eslatercera.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import terceraapi.eslatercera.Model.Persona2;
import terceraapi.eslatercera.repository.UserRepository;

/**
 *
 * @author HP
 */

@RestController
@RequestMapping("/register")
@CrossOrigin(origins = "*" )

public class RegisterController {
    
   @Autowired
    private UserRepository userRepository;

    @PostMapping("")
    public ResponseEntity<ApiResponse> registerUser(@RequestBody Persona2 user) {
        // Validar información de registro
        
          userRepository.save(user);
         HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        headers.add("Access-Control-Allow-Headers", "Content-Type, Authorization");
       
        ApiResponse response = new ApiResponse("success", "El registro fue exitoso en la BBDD");
        return ResponseEntity.ok().headers(headers).body(response);
    }

    /**
     * Clase POJO para la respuesta en formato JSON
     */
    public static class ApiResponse {
        private final String status;
        private final String message;

        public ApiResponse(String status, String message) {
            this.status = status;
            this.message = message;
        }

        public String getStatus() {
            return status;
        }

        public String getMessage() {
            return message;
        }
    }
}
   