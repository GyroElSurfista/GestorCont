/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.controllers;

import com.jairo.gest.encriptacion.Encriptador;
import com.jairo.gest.usuarios.Cuenta;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

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
    
    public Cuenta getCuenta(int codCuenta, String contM){
        Cuenta cuenta;
        Encriptador enc;
        Session session;
        
        cuenta  = null;
        enc     = new Encriptador();
        session = sf.openSession();
        
        try{
            
            session.beginTransaction();
            cuenta = session.get(Cuenta.class, codCuenta);
            session.close();
            
            cuenta.setNomCuenta(enc.desencriptar(cuenta.getNomCuenta(), contM));
            cuenta.setUsrCuenta(enc.desencriptar(cuenta.getUsrCuenta(), contM));
            cuenta.setContCuenta(enc.desencriptar(cuenta.getContCuenta(), contM));
            cuenta.setDescCuenta(enc.desencriptar(cuenta.getDescCuenta(), contM));
            cuenta.setUri(enc.desencriptar(cuenta.getUri(), contM));
            
      
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
        
        return cuenta;
    
    }
    
    public ArrayList<Cuenta> getCuentas(int codFolder, String contM){
        ArrayList<Cuenta> cuentas;
        Cuenta cuenta;
        List<Object[]> list;
        Session s;
        NativeQuery q;
        
        cuentas = new ArrayList<>();
        s       = sf.openSession();
        
        q = s.createNativeQuery("SELECT CODCUENTA FROM CUENTA WHERE CODFOLDER = :param1");
        q.setParameter("param1", codFolder);
        
        list = q.list();
        
        for(Object[] obj : list){
            cuenta = getCuenta((int)obj[0], contM);
            cuentas.add(cuenta);
        }
        
        
        return cuentas;
    }
    
}
