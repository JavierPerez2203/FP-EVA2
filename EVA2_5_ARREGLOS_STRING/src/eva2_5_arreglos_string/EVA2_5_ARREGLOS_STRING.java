/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_arreglos_string;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class EVA2_5_ARREGLOS_STRING {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int dia;
        String diasSemana[] = new String[7];
        diasSemana[0] = "domingo";
        diasSemana[1] = "lunes";
        diasSemana[2] = "martes";
        diasSemana[3] = "miercoles";
        diasSemana[4] = "jueves";
        diasSemana[5] = "viernes";
        diasSemana[6] = "sabado";
        System.out.println("introduce el dia en numero ( 0 - 6:");
        dia = captu.nextInt();
        System.out.println("el dia es:" + diasSemana[dia]);
        
       
        
        
    }
    
}
