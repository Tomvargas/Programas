package com.mycompany.restaurante;

/**
 *
 * @author tomvargas
 */
import com.mycompany.restaurante.users.client;
import javax.swing.JOptionPane;
public class main
{
    public static void main(String[] args){
        client a = new client("Juan", "Vegetales", true, 500, 0);
        double datos = a.descuentocliente();
        String nombre = a.getNombre();
        String pedido = a.getPedido();
        JOptionPane.showMessageDialog(null,"Nombre: "+nombre+"\n"+"Pedido: "+pedido+"\n"+"Pago: "+datos);
    }
}

