/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inmutabilidad;

/**
 *
 * @author User
 */
public class main {
       
    public static void main(String[] args) {
        // una variable text apunta a una string "Tomás"
        String text = "Tomás";        
        System.out.println(text);
        
        //Podemos intentar alterar esta string con métodos
        text.toUpperCase(); //esto debería hacer que toda la string cambie a mayusculas
        System.out.println(text);
        
        //aquí si se meustra la string en mayusculas
        System.out.println(text.toUpperCase());
        
        // para hacer los cambios se guarden y no queden flotando en memoria
        text = text.toUpperCase();
        System.out.println(text);
                
    }    
}
