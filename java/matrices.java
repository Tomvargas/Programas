import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

//@author tomvargas

public class matrices {
  
    public static void main(String[] args) {
        
        Scanner get =  new  Scanner(System.in);
        int n=0, sum=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        boolean val=true;
        
        while(val){
            System.out.print(">> Ingresar la dimension de la matriz a generar: ");
            n = get.nextInt();
            if (n>1 && n%2!=0){val=false;}
            else{System.out.println("La dimension de la matriz debe ser impar y mayor a uno.");}
        }
        
        int[][] matriz =  new  int[n][n];
        
        for (int i=0; i < matriz.length; i++) {
            
            for (int j=0; j < matriz[i].length; j++) {
                
                matriz[i][j] = (int)(Math.random()*100+1);
            }
        }
        
        System.out.println(">> MATRIZ GENERADA: ");
        System.out.println("==================================");
        
        for (int i=0; i < matriz.length; i++) {
            
            for (int j=0; j < matriz[i].length; j++) {
                
                System.out.print(matriz[i][j]+"   ");
            }
            System.out.println("");
        }
        
        System.out.println(">> BORDES: ");
        System.out.println("==================================");
        
        for (int i=0; i < matriz.length; i++) {
            
            for (int j=0; j < matriz[i].length; j++) {
                
                if(i==0 || i==n-1){
                
                System.out.print(matriz[i][j]+"   ");
                list.add(matriz[i][j]);
                
                }
                else{
                if(j==0 || j==n-1){
                    System.out.print(matriz[i][j]+"   ");
                    list.add(matriz[i][j]);
                    for(int c=0;c<n-1;c++){
                    System.out.print("    ");
                }
                     }   
                }
            }
            System.out.println("");
        }
        System.out.println("==================================");
        System.out.println(">> Numeros impares de la lista: ");
        for(int i:list){
            sum+=i;
            if(i%2!=0){System.out.print(i+" ");}
        }
        System.out.println("");
        System.out.println("==================================");
        System.out.println(">> Promedio total de los bordes generados: "+(sum/list.size()));
        System.out.println("");
        System.out.println("==================================");
        System.out.println("@Author tomas_vargas");
        System.out.println("==================================");
    }
}