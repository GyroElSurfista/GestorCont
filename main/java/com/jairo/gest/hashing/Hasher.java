/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.hashing;



import java.time.Duration;
import java.time.Instant;
import org.springframework.security.crypto.bcrypt.BCrypt;


/**
 *
 * @author Jairo
 */
public class Hasher {

    
    public String hash(String cont){
        Instant begin  = Instant.now();
        
        String digest;

        digest = BCrypt.hashpw(cont, BCrypt.gensalt(12));
        
        Instant end = Instant.now();
        
        System.out.println("El digest obtenido para la contraseña: " + cont + "es: " + digest);
        
        System.out.println("El tiempo que demoró el hash es: " + Duration.between(begin, end).toMillis());
        
        System.out.println("Comprobando la contraesña: " + BCrypt.checkpw(cont, digest));
        
        return digest;
    }
    
}
