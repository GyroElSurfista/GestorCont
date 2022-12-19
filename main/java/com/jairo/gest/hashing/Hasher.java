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

    
    public String hash(String plainText){
        Instant begin  = Instant.now();
        
        String digest;

        digest = BCrypt.hashpw(plainText, BCrypt.gensalt(12));
        
        Instant end = Instant.now();
        
        System.out.println("El digest obtenido para la contraseña: " + plainText + "es: " + digest);
        
        System.out.println("El tiempo que demoró el hash es: " + Duration.between(begin, end).toMillis());
        
        System.out.println("Comprobando la contraesña: " + BCrypt.checkpw(plainText, digest));
        
        return digest;
    }
    
    
    public boolean checkpw(String plainText, String digest){
        boolean iguales;
        
        iguales = BCrypt.checkpw(plainText, digest);
        
        return iguales;
    }
    
}
