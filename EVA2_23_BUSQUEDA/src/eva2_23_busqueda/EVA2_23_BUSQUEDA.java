/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_busqueda;

import java.util.Scanner;


public class EVA2_23_BUSQUEDA {

   
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor, posi = -1;//significa q no lo encontramos
        int datos[] = new int [10];
        for (int i = 0; i < datos.length; i++) {
            datos[i]= (int)(Math.random() * 100);
        }
        for (int i = 0; i < datos.length; i++){
            System.out.print("[" + datos [i] + "]");
        }
        System.out.println("");
        System.out.println("valor a buscar");
        valor = captu.nextInt();
        //busqueda lineal 
         for (int i = 0; i < datos.length; i++){
             if(valor == datos[i]){//lo encontramos
                 posi = i;//regresamos donde lo encotramos
                 break;//ya lo encontre,detengo la busqueda
                 
             }
         }
         System.out.println("posicion:" + posi);
        
    }
    
}
