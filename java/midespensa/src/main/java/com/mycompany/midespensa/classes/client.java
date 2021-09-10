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
public class client extends persona {
    
    private String clientID;

    public client(String clientID, String NumDoc, String TipeDoc, String Name, String Surname, String CodCity, String Dir, String Phone) {
        super(NumDoc, TipeDoc, Name, Surname, CodCity, Dir, Phone);
        this.clientID = clientID;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }
    
    
    
}
