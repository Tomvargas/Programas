/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alquiler_libros;

interface Prestable{
   public boolean prestado=false;
   
   public void prestar();
   public void devolver();
   
}
/**
 * @author tomvargas
 */
public class Libro implements Prestable {
    private String code;
    private String title;
    private int year;    
    private boolean pr=prestado;
    
    public Libro (String code, String title, int year){
        this.code=code;
        this.title=title;
        this.year=year;
    }
    
    public String getCode(){ return code; }
    public String getTitle(){ return title; }
    public int getYear(){ return year; }
    public boolean getStatus(){ return pr; }
    
    public void prestar(){ 
        pr=true;
        System.out.println("Usted ha alquilado este libro");
    }
    
    public void devolver(){ 
        pr=false;
        System.out.println("Usted ha devuelto este libro");
    }
    
    
    public String toString(){
        String estado = "desconocido";
        if (pr)
            estado="Prestado";
        else
            estado="Disponible";
        return ("Titulo: "+title+"\nCodigo: "+code+"\nAnio: "+year+"\nEstado: "+estado);
    }
    
}
