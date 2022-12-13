/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int numero = 25;
        int numeroDos;
        int numeroTres;
        int numeroCuatro;
        int contador;
        String mensaje = "";
        mensaje = mensaje + "N°\tx2\tx3\tx4\n";
        
        for(contador = 25; contador >= 1; contador--){
            numeroDos = numero * 2;
            numeroTres = numero * 3;
            numeroCuatro = numero * 4;
            mensaje = String.format("%s%d\t%d\t%d\t%d\n", 
                    mensaje,
                    numero, 
                    numeroDos, 
                    numeroTres, 
                    numeroCuatro);
            numero--;
            numeroDos--;
            numeroTres--;
            numeroCuatro--;
        }
        System.out.println(mensaje);   
    }
    
}
        
        
    

