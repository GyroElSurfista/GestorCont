/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.usuarios;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Jairo
 */

@Entity
@Table(name = "FOLDER")
public class Folder {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODFOLDER")
    private int codFolder;
    
    @Column(name = "CODUSR")
    private int codUsr;
    
    @Column(name = "NOMFOLDER")
    private String nomFolder;
    
    @Column(name = "DESCFOLDER")
    private String descFolder;
    
    @Transient
    private ArrayList<Cuenta> cuentas;

    public Folder() {
    }

    public Folder(int codFolder, int codUsr, String nomFolder, String descFolder, ArrayList<Cuenta> cuentas) {
        this.codFolder = codFolder;
        this.codUsr = codUsr;
        this.nomFolder = nomFolder;
        this.descFolder = descFolder;
        this.cuentas = cuentas;
    }
    

    public int getCodFolder() {
        return codFolder;
    }

    public void setCodFolder(int codFolder) {
        this.codFolder = codFolder;
    }

    public int getCodUsr() {
        return codUsr;
    }

    public void setCodUsr(int codUsr) {
        this.codUsr = codUsr;
    }

    public String getNomFolder() {
        return nomFolder;
    }

    public void setNomFolder(String nomFolder) {
        this.nomFolder = nomFolder;
    }

    public String getDescFolder() {
        return descFolder;
    }

    public void setDescFolder(String descFolder) {
        this.descFolder = descFolder;
    }

    @Override
    public String toString() {
        return "Folder{" + "codFolder=" + codFolder + ", codUsr=" + codUsr + ", nomFolder=" + nomFolder + ", descFolder=" + descFolder + '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Folder clone;
        
        clone = new Folder(codFolder, codUsr, nomFolder, descFolder, null);
        
        return clone;
    }
    
    

}