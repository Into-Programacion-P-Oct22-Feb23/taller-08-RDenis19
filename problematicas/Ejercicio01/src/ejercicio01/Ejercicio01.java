/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Usuario iTC
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String  nombreJugador;
        String posicionJugador;
        int  veces;
        int contador;
        int promedioEdad = 0;
        int edad; 
        double  estatura;
        double promedioEstatura = 0;
        String  mensaje = "" ;
        
        System.out.println("Ingrese el número de jugadores a los que "
                + "ingresará información: ");
        veces = entrada.nextInt();
        
        for(contador = 1; contador <= veces; contador++ ){
            entrada.nextLine();
            
            System.out.println("Ingrese el nombre del jugador:");
            nombreJugador = entrada.nextLine();
            
            System.out.println("Ingrese la posicion en el campo:");
            posicionJugador = entrada.nextLine();
            
            System.out.println("Ingrese la edad del jugador:");
            edad = entrada.nextInt();
            
            System.out.println("Ingrese la estatura del jugador:");
            estatura = entrada.nextDouble();
            promedioEdad = promedioEdad + edad;
            promedioEstatura = promedioEstatura + estatura;
            mensaje = String.format("%s%d. %s -%s-, edad %d, estatura %.2f"
                    + "\n", 
                    mensaje, 
                    contador, 
                    nombreJugador, 
                    posicionJugador,
                    edad, 
                    estatura);
        }
        promedioEstatura = promedioEstatura / veces;
        promedioEdad = promedioEdad / veces;
        System.out.printf("Listado de edades.%sPromedio de edades:%s "
                + "Promedio de estaturas:%.2f", 
                mensaje ,
                promedioEdad ,
                promedioEstatura);
    }
    
}
