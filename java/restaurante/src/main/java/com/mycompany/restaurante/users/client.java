package com.mycompany.restaurante.users;

/**
 * @author tomvargas
 */
public class client
{
    private String nombre;
    private String pedido;
    private boolean pagoEfectivo;
    private int precio;
    private double pago;
    
    //declare constructor of class
    public client (String nombre, String pedido, boolean pagoEfectivo, int precio, double pago){
        this.nombre=nombre;
        this.pedido=pedido;
        this.pagoEfectivo=pagoEfectivo;
        this.precio=precio;
        this.pago=pago;
    }
    
    
    public double descuentocliente(){
        double desc=0;
        if (pagoEfectivo){//---------------------------------------------------- if true or false
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
