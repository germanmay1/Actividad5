/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg3;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author User
 */
public class Actividad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Imprimir la suma consecutiva del 0 al 10
        System.out.println("Ejercicio 1");
       
        Scanner suma=new Scanner(System.in);
        int s=0;
        for (int i = 1; i <=100; i++) {
            
            s=s+i;
            
            System.out.println("la suma es " +s);
            
        }
        
        // Calcular el factorial del 1 al 10
        System.out.println("Ejercicio 2 ");
        int num = 1;
        int sum = 1;
        for (int i = 0; i < 11; i++) {
            sum = sum * num;
            num++;
            System.out.println(sum);
            }
        
        //Calcular el factorial de un número que sea introducido por el usuario
        System.out.println("Ejercicio 3");
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingresa un numero:");
        
        int numero = leer.nextInt();
        
        int factorial = 1;
        
        while(numero!=0)
            {
                factorial*=numero;
                numero --;
                }
        System.out.println("el factorial es: "+factorial);
        
        
            }
    }
