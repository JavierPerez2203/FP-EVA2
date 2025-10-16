/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_captura;

import java.util.Scanner;


public class EVA2_14_CAPTURA {

    
    public static void main(String[] args) {
       Scanner captu = new Scanner(System.in);
       int tama;
        System.out.println("cuantas calificaciones va a acpturar");
        tama = captu.nextInt();
        int califas[] = new int [tama];
        for (int i = 0; i < califas.length; i++){
            System.out.println("calificacion" + (i + 1) + ":");
        tama = captu.nextInt();
        }
        for (int i = 0; i < califas.length; i++){
            System.out.println("[" + califas[i] + "]");
             }
        int suma = 0;
        for (int i = 0; i < califas.length; i++){
             suma += califas[i];
             
            }
        double promedio = suma / (double)tama;
        System.out.println("promedio = " + promedio);
    }
    
}
