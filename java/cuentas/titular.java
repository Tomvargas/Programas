/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cuentas;
import java.lang.String;

/**
 *
 * @author tomvargas
 */
public class titular {
    private String nombre;
    private String cedula;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public void registrar_titular(String nom, String ced){
        setNombre(nom);
        setCedula(ced);
        System.out.println("Se registro el titular");
    }
}
