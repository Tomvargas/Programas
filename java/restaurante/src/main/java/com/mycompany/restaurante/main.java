package com.mycompany.restaurante;

/**
 * @author tomvargas
 */
import com.mycompany.restaurante.users.client; //import client class for instance a object
import javax.swing.JOptionPane;

public class main
{
    public static void main(String[] args){
        client a = new client("Juan", "Vegetales", true, 500, 0);//------------- instamce a object from clients
        double datos = a.descuentocliente();//---------------------------------- call client method
        String nombre = a.getNombre();//---------------------------------------- get client name
        String pedido = a.getPedido();//---------------------------------------- get client order
        
        //show client data
        JOptionPane.showMessageDialog(null,"Nombre: "+nombre+"\n"+"Pedido: "+pedido+"\n"+"Pago: "+datos);
    }
}

