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
public class persona {
    private String NumDoc;
    private String TipeDoc;
    private String Name;
    private String Surname;
    private String CodCity;
    private String Dir;
    private String Phone;

    public persona(String NumDoc, String TipeDoc, String Name, String Surname, String CodCity, String Dir, String Phone) {
        this.NumDoc = NumDoc;
        this.TipeDoc = TipeDoc;
        this.Name = Name;
        this.Surname = Surname;
        this.CodCity = CodCity;
        this.Dir = Dir;
        this.Phone = Phone;
    }

    public String getNumDoc() { return NumDoc; }
    public void setNumDoc(String NumDoc) { this.NumDoc = NumDoc; }

    public String getTipeDoc() { return TipeDoc; }
    public void setTipeDoc(String TipeDoc) { this.TipeDoc = TipeDoc; }

    public String getName() { return Name; }
    public void setName(String Name) { this.Name = Name; }

    public String getSurname() { return Surname; }
    public void setSurname(String Surname) { this.Surname = Surname; }

    public String getCodCity() { return CodCity; }
    public void setCodCity(String CodCity) { this.CodCity = CodCity; }

    public String getDir() { return Dir; }
    public void setDir(String Dir) { this.Dir = Dir; }

    public String getPhone() { return Phone; }
    public void setPhone(String Phone) { this.Phone = Phone; }   
    
    
}
