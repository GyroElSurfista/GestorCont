/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.controllers;

import com.jairo.gest.encriptacion.Encriptador;
import com.jairo.gest.usuarios.Cuenta;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Jairo
 */
public class CuentaController {
    
    private SessionFactory sf;
    
    public CuentaController(){
        sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cuenta.class).buildSessionFactory();
    }
    
    
    public void saveCuenta(Cuenta cuenta, String contM){
        Cuenta clone;
        Encriptador enc;
        Session session;
        
        session = sf.openSession();
        
        
        try{
            clone   = (Cuenta) cuenta.clone();
            enc     = new Encriptador();
            
            clone.setNomCuenta(enc.encriptar(clone.getNomCuenta(), contM));
            clone.setUsrCuenta(enc.encriptar(clone.getUsrCuenta(), contM));
            clone.setContCuenta(enc.encriptar(clone.getContCuenta(), contM));
            clone.setDescCuenta(enc.encriptar(clone.getDescCuenta(), contM));
            clone.setUri(enc.encriptar(clone.getUri(), contM));
            
            session.beginTransaction();
            
            session.save(clone);
            
            session.getTransaction().commit();
            
            sf.close();
        
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
        
    }
}
