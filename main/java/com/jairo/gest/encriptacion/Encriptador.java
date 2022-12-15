/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.encriptacion;

import com.rockaport.alice.Alice;
import com.rockaport.alice.AliceContext;
import com.rockaport.alice.AliceContextBuilder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Jairo
 */
public class Encriptador {
    
    private Alice aesEnc;
    private Charset charset;
    
    public Encriptador(){
        AliceContext aliceContext = new AliceContextBuilder()
        .setAlgorithm(AliceContext.Algorithm.AES)
        .setMode(AliceContext.Mode.CTR)
        .setPbkdf(AliceContext.Pbkdf.PBKDF_2_WITH_HMAC_SHA_256)
        .build();
        
        aesEnc = new Alice(aliceContext);
        charset = StandardCharsets.UTF_8;
    }
    
    public String encriptar(String plainText, String cont){
        String encryptedText;
        byte[] encriptado;
        
        encryptedText = null;
        
        try{
                encriptado = aesEnc.encrypt(plainText.getBytes(charset), cont.toCharArray());
                encryptedText = new String(encriptado, charset);
                
         }catch(Exception e){
             
                System.out.println(e.toString());
         
         }
        
        return encryptedText;
    }
    
    
    public String desencriptar(String encryptedText, String cont){
        String plainText;
        byte[] desencriptado;
        
        plainText = null;
        
        try{
                
                
                desencriptado = aesEnc.decrypt(encryptedText.getBytes(charset), cont.toCharArray());
                plainText = new String(desencriptado, charset);
                
         }catch(Exception e){
             
                System.out.println(e.toString());
         
         }
        
        return plainText;
    }
}
