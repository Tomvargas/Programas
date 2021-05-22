/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restaurante.users;

/**
 *
 * @author tomvargas
 */
public class client
{
    private String nombre;
    private String pedido;
    private boolean pagoEfectivo;
    private int precio;
    private double pago;
    
    public client (String nombre, String pedido, boolean pagoEfectivo, int precio, double pago){
        this.nombre=nombre;
        this.pedido=pedido;
        this.pagoEfectivo=pagoEfectivo;
        this.precio=precio;
        this.pago=pago;
    }
    
    public double descuentocliente(){
        double desc=0;
        if (pagoEfectivo){
            desc=precio-precio*0.10;
            pago = precio-desc;
            
            return desc;
        }
        else{
            return 0;
        }
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getPedido(){
        return pedido;
    }
}
