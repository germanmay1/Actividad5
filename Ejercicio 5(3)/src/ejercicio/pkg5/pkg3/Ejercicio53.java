/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5.pkg3;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Ejercicio53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir un número y leer n veces números..
        System.out.println("Ejercicio 5");
        Scanner leer = new Scanner (System.in);
        int num [] = new int [3];
        System.out.println("Ingrese los numeros que va a sumar y sacar el promedio");
        int sum = 0; 
        for (int i = 0; i < 3; i++) {
            num[i] = leer.nextInt();
            sum = sum+ num[i];
            System.out.println("suma="+sum);
        }
        int mayor = num[0];
        int menor = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>mayor) {
                mayor = num[i];
            }
            if (num[i]<menor) {
                menor = num[i];
            }
            
        }
        int distacia = mayor-menor;
        float promedio = sum/3;
        System.out.println("El promedio es: "+ promedio );
        System.out.println("El numero mayor es: " + mayor +" y el numero menor es: "+ menor );
        System.out.println("La distancia entre entre los numeros es: "+ distacia );
    }
    
}
