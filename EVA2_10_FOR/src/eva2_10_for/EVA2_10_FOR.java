/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class EVA2_10_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //IMPRIMIR LOS NUMEROS DEL 1-20:
        //1-2-3-4-5-6-7-8-9-10-11-12-13-14-15-16-17-18-19-20:
        for (int i =1; i <= 20; i++)
            System.out.println(i + "-");
        //imorimir los numeros pares de 0-100
        //0-2-4-6...100
        // += suma, -=resta
        System.out.println("");
        for (int i =0 ; i <= 100; i+=2)
            System.out.println(i + "-");
        //repitan el anterior, en orden inverso
        for (int i =100 ; i >= 0; i-=2)
            System.out.println(i + "-");
        //imprimir la lista de numeros entre cualquier valor
        //que el usuario quiera
        //EJEMPLOS: -15 Y 5 -- -15 -14 -13 ... 0 1 2 3 4 5
        Scanner captu = new Scanner(System.in);
        int ini,fin;
        
            System.out.println("inicio");
            ini = captu.nextInt();
              System.out.println("final");
              fin = captu.nextInt();
              for (int i =ini ; i <= fin; i++)
                  System.out.print(i + "-");
              System.out.println("");
              for (int i =fin ; i >= ini; i--)
                  System.out.print(i + "-");

        //IMPRIMIR EN ORDEN INVERSO
        //IMPRIMIR LA TABLA DE MULTIPLICAR (1 A 10) DE
        //CUALQUIER NUMERO QUE DE EL USUARIO
        
        
        
    }
    
}
