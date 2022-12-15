/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.controllers;

import com.jairo.gest.encriptacion.Encriptador;
import com.jairo.gest.usuarios.Cuenta;
import com.jairo.gest.usuarios.Folder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Jairo
 */
public class FolderController {
    
    private SessionFactory sf;
    
    public FolderController(){
        sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Folder.class).buildSessionFactory();
    }
    
    
    public void saveFolder(Folder folder, String contM){
        Folder clone;
        Encriptador enc;
        Session session;
        
        session = sf.openSession();
        
        
        try{
            clone   = (Folder) folder.clone();
            enc     = new Encriptador();
            
            clone.setNomFolder(enc.encriptar(clone.getNomFolder(), contM));
            clone.setDescFolder(enc.encriptar(clone.getDescFolder(), contM));
            
            session.beginTransaction();
            
            session.save(clone);
            
            session.getTransaction().commit();
            
            sf.close();
        
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
