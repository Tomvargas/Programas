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
public class factura {
    private String CodFac;
    private String empleadoID;
    private String clientID;
    private String DateFact;
    private String Pago;
    private float subtotal;
    private float total;

    public factura(String CodFac, String empleadoID, String clientID, String DateFact, String Pago, float subtotal, float total) {
        this.CodFac = CodFac;
        this.empleadoID = empleadoID;
        this.clientID = clientID;
        this.DateFact = DateFact;
        this.Pago = Pago;
        this.subtotal = subtotal;
        this.total = total;
    }

    public String getCodFac() {
        return CodFac;
    }

    public void setCodFac(String CodFac) {
        this.CodFac = CodFac;
    }

    public String getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(String empleadoID) {
        this.empleadoID = empleadoID;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getDateFact() {
        return DateFact;
    }

    public void setDateFact(String DateFact) {
        this.DateFact = DateFact;
    }

    public String getPago() {
        return Pago;
    }

    public void setPago(String Pago) {
        this.Pago = Pago;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
}
