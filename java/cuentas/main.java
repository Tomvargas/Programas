/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cuentas;
import java.lang.String;
import java.util.Date;
import java.util.Scanner;

/**
 * @author tomvargas
 */
public class main {
    
    public static void main(String args[]){
        Scanner insert = new Scanner (System.in);
        cuenta c1 = new cuenta ();
        int id;
        double saldo = -1;
        String fecha = "";
        Boolean tipovalor = false;
        int tipo;
        double valor = 0;
        String nombre = "";
        String cedula = "";
        
        Date fech = new Date();
        int op;
        
        System.out.println("Registre su cuenta bancaria");
        System.out.println("> Ingrese Su nombre completo: ");
        nombre = insert.nextLine();
        System.out.println("> Ingrese su numero de cedula: ");
        cedula = insert.nextLine();
        id = 1223;
        while(saldo < 0){
            
            System.out.println("> Inserte el monto del deposito inicial: $");
            saldo = insert.nextDouble();
            if(saldo < 0 ){
                System.out.println("No puede insertar un monto en negativo");
            }
        }
        
        fecha = fech.toString();
        
        tipo = 2;
        do{
        System.out.println("> Elija que tipo de cuenta desea (1 = Cnta. de ahorros || 0 = Cnta. corriente): ");
        tipo = insert.nextInt();
        if (tipo == 1){
            
            tipovalor = true;
            valor = 2.5;
        }
        else{
            if(tipo == 0){
                
                tipovalor = false;
                valor = 2.5;
            }
            else{
                System.out.println("Debe insertar 1 o 0");
            }
        }
        }while(tipo == 2);
        
        c1.registrar_cuenta(id, saldo, fecha, tipovalor, valor, nombre, cedula);
        int ex = 0;
        do{
            System.out.println("GESTION DE CUENTA BANCARIA");
            double s = c1.getSaldoini();
            if(s==0){
                System.out.println("<< Aviso: Su cuenta está en $0,00 >>");
            }
            System.out.println("1) Depositar dinero.\n2) Retirar dinero\n3) Consultar saldo disponible\n4) Salir");
            op = insert.nextInt();
            switch(op){             
                case 1:
                    c1.depositar();
                    break;
                case 2:
                    c1.retirar();
                    break;
                case 3:
                    c1.consulta();
                    break;
                case 4:
                    ex=1;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(ex==0);
    }
}
