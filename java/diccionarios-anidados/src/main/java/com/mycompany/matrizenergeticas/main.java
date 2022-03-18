package com.mycompany.matrizenergeticas;

import java.util.*;

/**
 *
 * @author tomvargas
 */
public class main {
    public static void main(String args[]){
        
        //scanner para entradas en consola
        Scanner in = new Scanner(System.in);
        
        //listas de ciudades para cada region
        ArrayList<String> costa = new ArrayList<String>();
        costa.add("Guayaquil");
        costa.add("Manta");
        
        ArrayList<String> sierra = new ArrayList<String>();
        sierra.add("Quito");
        sierra.add("Ambato");
        sierra.add("Loja");
        
        ArrayList<String> oriente = new ArrayList<String>();
        oriente.add("Tena");
        oriente.add("Nueva Loja");
        
        // diccionario de datos con la informción de cada region
        Dictionary informacion = new Hashtable(); 
        informacion.put("costa", costa);  
        informacion.put("sierra", sierra); 
        informacion.put("oriente", oriente);
        
        //Lista de datos de consumos de quito en coca codo Sinclair
        ArrayList<Integer> consumos_quito_ccs = new ArrayList<Integer>();
        consumos_quito_ccs.add(400);
        consumos_quito_ccs.add(432);
        consumos_quito_ccs.add(400);
        consumos_quito_ccs.add(432);
        consumos_quito_ccs.add(420);
        consumos_quito_ccs.add(432);
        consumos_quito_ccs.add(460);
        consumos_quito_ccs.add(432);
        consumos_quito_ccs.add(400);
        consumos_quito_ccs.add(432);
        consumos_quito_ccs.add(300);
        consumos_quito_ccs.add(213);
        
        //Lista de datos de consumos de guayaquil en coca codo Sinclair
        ArrayList<Integer> consumos_gye_ccs = new ArrayList<Integer>();
        consumos_gye_ccs.add(120);
        consumos_gye_ccs.add(55);
        consumos_gye_ccs.add(32);
        consumos_gye_ccs.add(120);
        consumos_gye_ccs.add(75);
        consumos_gye_ccs.add(32);
        consumos_gye_ccs.add(150);
        consumos_gye_ccs.add(55);
        consumos_gye_ccs.add(32);
        consumos_gye_ccs.add(120);
        consumos_gye_ccs.add(97);
        consumos_gye_ccs.add(32);
        
        //Lista de datos de consumos de guayaquil en sopladora
        ArrayList<Integer> consumos_gye_s = new ArrayList<Integer>();
        consumos_gye_s.add(310);
        consumos_gye_s.add(220);
        consumos_gye_s.add(321);
        consumos_gye_s.add(310);
        consumos_gye_s.add(220);
        consumos_gye_s.add(321);
        consumos_gye_s.add(310);
        consumos_gye_s.add(220);
        consumos_gye_s.add(321);
        consumos_gye_s.add(310);
        consumos_gye_s.add(220);
        consumos_gye_s.add(321);
        
        //Lista de datos de consumos de quito en sopladora
        ArrayList<Integer> consumos_quito_s = new ArrayList<Integer>();
        consumos_quito_s.add(400);
        consumos_quito_s.add(432);
        consumos_quito_s.add(587);
        consumos_quito_s.add(400);
        consumos_quito_s.add(432);
        consumos_quito_s.add(587);
        consumos_quito_s.add(400);
        consumos_quito_s.add(432);
        consumos_quito_s.add(587);
        consumos_quito_s.add(400);
        consumos_quito_s.add(432);
        consumos_quito_s.add(587);
        
        //Lista de datos de consumos de loja en sopladora
        ArrayList<Integer> consumos_loja_s = new ArrayList<Integer>();
        consumos_loja_s.add(50);
        consumos_loja_s.add(32);
        consumos_loja_s.add(32);
        consumos_loja_s.add(50);
        consumos_loja_s.add(32);
        consumos_loja_s.add(32);
        consumos_loja_s.add(50);
        consumos_loja_s.add(32);
        consumos_loja_s.add(32);
        consumos_loja_s.add(50);
        consumos_loja_s.add(32);        
        consumos_loja_s.add(32);
        
        //Diccionario de datos con los consumos y tarifa de quito en CCS
        Dictionary CCS_QTO = new Hashtable();
        CCS_QTO.put("consumos", consumos_quito_ccs);
        CCS_QTO.put("tarifa", 65);
        
        //Diccionario de datos con los consumos y tarifa de guayaquil en CCS
        Dictionary CCS_GYE = new Hashtable();
        CCS_GYE.put("consumos", consumos_gye_ccs);
        CCS_GYE.put("tarifa", 84);
        
        //Diccionario de datos con los consumos y tarifa de Guayaquil en S
        Dictionary S_GYE = new Hashtable();
        S_GYE.put("consumos", consumos_gye_s);
        S_GYE.put("tarifa", 55);
        
        //Diccionario de datos con los consumos y tarifa de Quito en S
        Dictionary S_QTO = new Hashtable();
        S_QTO.put("consumos", consumos_quito_s);
        S_QTO.put("tarifa", 79);
        
        //Diccionario de datos con los consumos y tarifa de Loja en S
        Dictionary S_LJA = new Hashtable();
        S_LJA.put("consumos", consumos_loja_s);
        S_LJA.put("tarifa", 32);
        
        
        //Diccionario con los datos de quito y guayaquil en CCS
        Dictionary CCS = new Hashtable();
        CCS.put("Quito", CCS_QTO);
        CCS.put("Guayaquil", CCS_GYE);
        
        //Diccionario con los datos de quito, loja y guayaquil en S
        Dictionary S = new Hashtable();
        S.put("Guayaquil", S_GYE);
        S.put("Quito", S_QTO);
        S.put("Loja", S_LJA);
        
        //Diccionario con los datos de CCS y S
        Dictionary consumo_energia = new Hashtable();
        consumo_energia.put("Coca codo cinclair", CCS);
        consumo_energia.put("Sopladora", S);
        
        int aux = 1;
        
        while(aux==1){
        
            System.out.println("===== MATRIZ ENERGETICA =====");
            System.out.println("1) Consumo de planta.");
            System.out.println("2) Planta de cuidad.");
            System.out.println("3) Ganancias de region.");
            System.out.println("4) Salir del programa.");
            System.out.println(">> Seleccione una opcion: ");

            String op = in.nextLine();

            switch(op){
                case "1":
                    System.out.println(">> Ingrese el nombre de la planta energetica: ");
                    String planta = in.nextLine();
                    planta = planta.substring(0, 1).toUpperCase() + planta.substring(1);
                    
                    System.out.println(">> Ingrese el nombre de la ciudad: ");
                    String ciudad = in.nextLine();
                    ciudad = ciudad.substring(0, 1).toUpperCase() + ciudad.substring(1);
                    
                    Dictionary Planta = (Dictionary) consumo_energia.get(planta);
                    if(Planta != null){
                        Dictionary Ciudad = (Dictionary) Planta.get(ciudad);
                        
                        if(Ciudad != null){
                           ArrayList<Integer> consumo =  (ArrayList<Integer>) Ciudad.get("consumos");
                            int total = 0;
                            for (int i : consumo) {
                               total += i; 
                            }                            
                            System.out.println("Consumo de "+ciudad+" en "+planta+": "+total+" Megavatios.\n");
                            
                        }else{
                            System.out.println(planta+" no suministra energia en esta ciudad"+" o no existe...\n");
                        }
                    }else{
                        System.out.println("> No existe una planta energética con el nombre ingresado, vuelva a intentar...\n");
                    }
                    
                    break;
                    
                case "2":
                    
                    System.out.println(">> Ingrese el nombre de la ciudad: ");
                    String ciudad2 = in.nextLine();
                    ciudad2 = ciudad2.substring(0, 1).toUpperCase() + ciudad2.substring(1);
                    
                    Dictionary consumo_ciudad = new Hashtable();
                    String msj="";
                    
                    Dictionary cocacodo1 = (Dictionary) consumo_energia.get("Coca codo cinclair");
                    Dictionary sopladora1 = (Dictionary) consumo_energia.get("Sopladora");
                    
                    Dictionary ciudadCcs1 = (Dictionary) cocacodo1.get(ciudad2);
                    if(ciudadCcs1 != null){
                        ArrayList<Integer> consumo =  (ArrayList<Integer>) ciudadCcs1.get("consumos");
                        int tot = 0;
                        for (int i : consumo) {
                           tot += i; 
                        }
                        consumo_ciudad.put("Coca codo cinclair",tot);
                        msj="";
                    }else{
                        msj="No se administra energia a esta ciudad o no existe...";
                    }
                    
                    Dictionary ciudadS1 = (Dictionary) sopladora1.get(ciudad2);
                    if(ciudadS1 != null){
                        ArrayList<Integer> consumo =  (ArrayList<Integer>) ciudadS1.get("consumos");
                        int tot = 0;
                        for (int i : consumo) {
                           tot += i; 
                        }
                        consumo_ciudad.put("Sopladora",tot);
                        msj="";
                    }else{
                        msj="No se administra energia a esta ciudad o no existe...";
                    }
                    
                    if(!consumo_ciudad.isEmpty()){
                        System.out.println(consumo_ciudad);
                    }else{
                        System.out.println(msj);
                    }
                    
                    break;
                    
                case "3":
                    System.out.println(">> Ingrese el nombre de la region: ");
                    String region = in.nextLine();
                    
                    ArrayList<String> Region = (ArrayList<String>) informacion.get(region);
                    if(Region != null){
                        int total = 0;
                        Dictionary cocacodo = (Dictionary) consumo_energia.get("Coca codo cinclair");
                        Dictionary sopladora = (Dictionary) consumo_energia.get("Sopladora");
                        
                        for (String i : Region) {
                            
                            Dictionary ciudadCcs = (Dictionary) cocacodo.get(i);
                            Dictionary ciudadS = (Dictionary) sopladora.get(i);
                            if(ciudadCcs != null){
                                ArrayList<Integer> consumo =  (ArrayList<Integer>) ciudadCcs.get("consumos");
                                int tarifa = (int) ciudadCcs.get("tarifa");
                                int subtot = 0;
                                for (int j : consumo) {
                                   subtot += j; 
                                }
                                total += subtot*tarifa;
                            }
                            
                            if(ciudadS != null){
                                ArrayList<Integer> consumo =  (ArrayList<Integer>) ciudadS.get("consumos");
                                int tarifa = (int) ciudadS.get("tarifa");
                                int subtot = 0;
                                for (int j : consumo) {
                                   subtot += j; 
                                }
                                total += subtot*tarifa;
                            }
                        }
                        
                        System.out.println("Ganancias totales en la region "+region+": $"+total);
                        
                    }else{
                        System.out.println("> No existe una region con el nombre ingresado, vuelva a intentar...\n");
                    }
                    
                    break;
                case "4":
                    aux=0;
                    break;
                default:
                    System.out.println("Entrada invalida, por favor ingrese una opcion valida...\n");
                    break;
            }
        }
        
    }
}
