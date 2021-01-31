/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cuentas;
import java.lang.String;
import java.util.Scanner;

/**
 * @author tomvargas
 */
public class cuenta extends titular {
    private int id;
    private double saldoini;
    private String fechaini;
    private Boolean tipo; //1 Ahorros - 0 Corriente
    private double valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldoini() {
        return saldoini;
    }

    public void setSaldoini(Double saldoini) {
        this.saldoini = saldoini;
    }

    public String getFechaini() {
        return fechaini;
    }

    public void setFechaini(String fechaini) {
        this.fechaini = fechaini;
    }

    public Boolean getTipo() {
        return tipo;
    }

    public void setTipo(Boolean tipo) {
        this.tipo = tipo;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void registrar_cuenta(int id, double saldoini, String fechaini, Boolean tipo, double valor, String nombre, String ced){
        super.registrar_titular(nombre, ced);
        setId(id);
        setSaldoini(saldoini);
        setFechaini(fechaini);
        setTipo(tipo);
        setValor(valor);
        
        System.out.println("Cuenta registrada exitosamente");
    }
    
    public void depositar(){
        Scanner insert = new Scanner (System.in);
        double monto;
        int val=0;
        do{
            System.out.println("> Ingrese el monto a depositar");
            monto = insert.nextDouble();
            if (monto <1){
                System.out.println("No puede depositar menos de $1,00");
            }else{
                val = 1;
                double saldoactual = this.getSaldoini() + monto;
                this.setSaldoini(saldoactual);
                System.out.println("Su deposito se ha realizado...");
            }
        }while(val == 0);        
    }
    
    public void retirar(){
        Scanner insert = new Scanner (System.in);
        double monto;
        int val=0;
        do{
            System.out.println("> Ingrese el monto a retirar");
            monto = insert.nextDouble();
            if (monto <1){
                System.out.println("No puede depositar menos de $1,00");
            }else{
                val = 1;
                double saldoactual = this.getSaldoini();
                if((saldoactual-monto) < 0){
                    System.out.println("Su saldo actual no permite retirar el monto ingresado");
                }else{
                    saldoactual = saldoactual - monto;
                    this.setSaldoini(saldoactual);
                    System.out.println("Su Retiro se ha realizado...");
                }
            }
        }while(val == 0);     
    }
    
    public void consulta(){
        String var = "Cuenta Bancaria N° "+this.getId()+"\n-----------------";
        var = var+"\nTitular: "+super.getNombre()+"\nFecha de de apertura: "+this.getFechaini();
        var = var+"\nSaldo actual de la cuenta: $"+this.getSaldoini();
        if(!this.getTipo()){
            System.out.println("<< AVISO: SU CUENTA CORRIENTE TIENE UN COSTO DE MANTENIMIENTO DE $"+this.getValor()+" CADA 3 MESES >>");
        }else{
            System.out.println("<< AVISO: SU CUENTA DE AHORROS TIENE UN INTERES QUE SE ACREDITA $"+this.getValor()+" CADA 3 MESES >>");
        }
        System.out.println(var);
    }
}
