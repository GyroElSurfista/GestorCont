/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.creadores;

import com.jairo.gest.controllers.CuentaController;
import com.jairo.gest.usuarios.Cuenta;
import com.jairo.gest.usuarios.Folder;

/**
 *
 * @author Jairo
 */
public class CreadorCuenta {
    private String contM;
    private Folder folder;

    public CreadorCuenta(String contM, Folder folder) {
        this.contM = contM;
        this.folder = folder;
    }

    
    
    
    public void crearCuenta(String nomCuenta, String usrCuenta, String contCuenta, String descCuenta, String uri){
        Cuenta cuenta;
        CuentaController cc;
        
        cuenta  = new Cuenta(folder.getCodFolder(), nomCuenta, usrCuenta, contCuenta, descCuenta, uri);
        cc      = new CuentaController();
        
        folder.addCuenta(cuenta);
        
        cc.saveCuenta(cuenta, contM);
    }
    
    
}
