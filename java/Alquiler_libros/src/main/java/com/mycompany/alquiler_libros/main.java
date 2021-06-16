/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alquiler_libros;
import java.util.ArrayList;

/**
 *
 * @author tomvargas
 */
public class main {
    
    public static int cuentaPrestados(ArrayList<Libro> bookList){
        int count=0;
        for (int i=0; i<bookList.size(); i++){
            if(bookList.get(i).getStatus()){
                count++;
            }
        }
        
        return count;
    }
    
    public ArrayList<Libro> retornaPrestados(ArrayList<Libro> bookList){
        ArrayList<Libro> newlist = new ArrayList<Libro>();
        
        for (int i=0; i<bookList.size(); i++){
            if(!bookList.get(i).getStatus()){
                newlist.add(bookList.get(i));
            }
        }
        
        return newlist;
    }
    
    public static int publicacionesAnterioresA(ArrayList<Revista> magList, int y){
        int count=0;
        for (int i=0; i<magList.size(); i++){
            if(magList.get(i).getYear()< y){
                count++;
            }
        }
        return count;
    }
    
    public static Libro newbook(String c, String t, int y){
        Libro book = new Libro(c,t,y);
        return book;
    }
    
    public static Revista newmag(String c, String t, int y, int n){
        Revista mag = new Revista(c,t,y,n);
        return mag;
    }
    
    public static void main(String[] args){
        
       //--------------------------------------crear arrays de libros y revistas
        ArrayList<Libro> books = new ArrayList<Libro>();
        ArrayList<Revista> mag = new ArrayList<Revista>();
        
        books.add(newbook("001","1000 anios de soledad",1998));
        books.add(newbook("002","Software modeling and design",2011));
        books.add(newbook("003","Metodología y herramientas UML",2005));
        books.add(newbook("004","Viaje al centro de la tierra",1997));
        books.add(newbook("005","Ciencias naturales",2017));
        books.add(newbook("006","El señor de los anillos",1998));
        books.add(newbook("007","Harry Potter",1998));
        books.add(newbook("008","Anatomía humana",1998));
        books.add(newbook("009","Algebra de baldor",1998));
        books.add(newbook("010","Historia de la informática",1998));
        
        //-----------------------------------------------prestar 5 publicaciones
        for (int i=0; i<Math.round(books.size()/2); i++)
            books.get(i).prestar();
        
        
        mag.add(newmag("b001", "Generacion 21", 1989, 1234));
        mag.add(newmag("b002", "Moda actual", 1985, 1235));
        mag.add(newmag("b003", "Informática", 1984, 1236));
        mag.add(newmag("b004", "diseño UX", 2020, 1237));
        mag.add(newmag("b005", "web design", 2021, 1238));
        
        
        //-----------------------------------------------mostrar array de libros
        System.out.println("## Libros Registrados ##");
        for (int i=0; i<books.size();i++)
            System.out.println(books.get(i).toString());
        
        //---------------------------------------------mostrar array de revistas
        System.out.println("## Revistas registradas ##");
        for (int i=0; i<mag.size();i++)
            System.out.println(mag.get(i).toString());
        
        
        //----------------------------------mostrar cantidad de libros prestados
        System.out.println("Cantidad de libros prestados: "+ cuentaPrestados(books));
        
        //-------------------mostrar cantidad de publicaciones anteriores a 1990 
        System.out.println("Cantidad de revistas publicadas antes de 1990: "+ publicacionesAnterioresA(mag,1990));       
        
    }
    
}
