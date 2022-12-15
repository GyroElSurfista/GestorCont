/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.controllers;

import com.jairo.gest.usuarios.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

/**
 *
 * @author Jairo
 */
public class UsuarioController {
    
    private SessionFactory sf;
    
    
    public UsuarioController(){
        sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Usuario.class).buildSessionFactory();
    }
    
    public int usuarioRegistrado(String usuario, String contM){
        int codUsr;
        Session s;
        NativeQuery sp;
        Object[] result;
        
        s       = sf.openSession();
        sp      = s.createSQLQuery("EXECUTE VerifUsrExistIS :param1, :param2");
        sp.setParameter("param1", usuario);
        sp.setParameter("param2", contM);
        
        result = (Object[])(sp.uniqueResult());
        
        if(result != null){
            codUsr = Integer.parseInt(result[0].toString());
        }else{
            codUsr = -1;
        }
        
        return codUsr;
    }
    
    public boolean usuarioRegistrado(String usuario){
        boolean registrado;
        Session s;
        NativeQuery sp;
        
        
        s       = sf.openSession();
        sp      = s.createSQLQuery("EXECUTE CompUsrExist :param1");
        sp.setParameter("param1", usuario);
        
        registrado = sp.uniqueResult() != null;
        
        return registrado;
    }
    
    public void registrarUsuario(String usuario, String contM){
        
        Session s;
        Transaction txn;
        NativeQuery sp;
        
        
        s       = sf.openSession();
        txn     = s.beginTransaction();
        sp      = s.createSQLQuery("EXECUTE RegUsr :param1, :param2");
        sp.setParameter("param1", usuario);
        sp.setParameter("param2", contM);
        sp.executeUpdate();
        txn.commit();
        
        
        
    
    }
    
    public Usuario getUsuario(int codUsr){
        
        Usuario usr;
        
        usr = null;
       
        Session session = sf.openSession();
        
        try{
            
            session.beginTransaction();
            
            usr = session.get(Usuario.class, codUsr);
            
            session.getTransaction().commit();
            
            sf.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        return usr;
    }
    
    
    
}
