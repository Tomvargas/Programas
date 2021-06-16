/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alquiler_libros;

/**
 *
 * @author tomvargas
 */
public class Revista {
    
    private String code;
    private String title;
    private int year;
    private int number;
    
    public Revista(String code, String title, int year, int number){
        this.code=code;
        this.title=title;
        this.year=year;
        this.number=number;
    }
    
    public int getYear(){ return year; }
    
    public String toString(){
        return ("Revista: "+title+"\nCodigo: "+code+"\nAnio: "+year+"\nNumero: "+number );
    }
    
}
