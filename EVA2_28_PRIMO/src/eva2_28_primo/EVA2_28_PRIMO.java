/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_primo;

import java.util.Scanner;


public class EVA2_28_PRIMO {


    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in); 
        System.out.print("Ingrese un numero entero positivo:");
        int numero = captu.nextInt();

        if (numero <= 1) {
            System.out.println(numero + "no es un numero primo.");
        } else {
            boolean esPrimo = true;
            for (int i = 2; i < Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            //if (esPrimo){
                System.out.println(numero + " es un numero primo.");
            //} else {
               // System.out.println(numero + " no es un numero primo.");
            }
        }
    }
    
//}
