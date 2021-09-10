/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.midespensa.classes;

/**
 *
 * @author User
 */
public class proveedor extends persona {
    private String NameCommerce;
    private String CodProv;

    public proveedor(String NameCommerce, String CodProd, String NumDoc, String TipeDoc, String Name, String Surname, String CodCity, String Dir, String Phone) {
        super(NumDoc, TipeDoc, Name, Surname, CodCity, Dir, Phone);
        this.NameCommerce = NameCommerce;
        this.CodProv = CodProv;
    }

    public String getNameCommerce() { return NameCommerce; }
    public void setNameCommerce(String NameCommerce) { this.NameCommerce = NameCommerce; }

    public String getCodProv() { return CodProv; }
    public void setCodProv(String CodProv) { this.CodProv = CodProv; }   
    
}
