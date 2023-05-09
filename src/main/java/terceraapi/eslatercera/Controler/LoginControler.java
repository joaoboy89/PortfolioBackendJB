/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terceraapi.eslatercera.Controler;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import terceraapi.eslatercera.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import terceraapi.eslatercera.Model.Persona2;

/**
 *
 * @author HP
 */

@RestController 
@RequestMapping("/login")
@CrossOrigin(origins = "*")
public class LoginControler {
 
    @Autowired UserRepository userRepository;
    
    @PostMapping("")
  public ResponseEntity<ApiResponse> loginUser(@RequestBody LoginRequest loginRequest) {
    Optional<Persona2> user = userRepository.findByEmail(loginRequest.getUsername());
    if (user.isPresent() && user.get().getPassword().equals(loginRequest.getPassword())) {
      HttpHeaders headers = new HttpHeaders();
      headers.add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
      headers.add("Access-Control-Allow-Headers", "Content-Type, Authorization");

      ApiResponse response = new ApiResponse("success", "Login successful!");
      return ResponseEntity.ok().headers(headers).body(response);
    } else {
      ApiResponse response = new ApiResponse("error", "Invalid username or password");
      return ResponseEntity.badRequest().body(response);
    }
  }

  public static class LoginRequest {
    private String username;
    private String password;

    public String getUsername() {
      return username;
    }

    public void setUsername(String username) {
      this.username = username;
    }

    public String getPassword() {
      return password;
    }

    public void setPassword(String password) {
      this.password = password;
    }
  }
  
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
    

