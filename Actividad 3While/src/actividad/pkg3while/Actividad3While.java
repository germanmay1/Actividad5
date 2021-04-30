/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg3while;
import java.util.Scanner;

public class Actividad3While {
    
    public static void Actividad3_1() {
        
        System.out.println("Actividad 3.1");
        
        int factorial = 1;
        int num=0;
        while (num < 10) {            
            num++;
           
            factorial = factorial*num;
        }
        System.out.println(factorial);
        
    }

   public static void Actividad3_2() {
       
       System.out.println("Actividad 3.2");
       
       System.out.println("Factorial para el usuario");
        
        int valor1 = 0;
        System.out.println("Ingresa un valor");
        Scanner usuario =new Scanner(System.in);
        valor1 = usuario.nextInt();
        
        int factorial = 1;
        int num=0;
        while (num < valor1) {            
            num++;
           
            factorial = factorial*num;
        }
        System.out.println(factorial);
   }
   
    public static void Actividad3_3() {
        
        System.out.println("Actividad 3.3");
        
        int usuario =0;
        System.out.println("Ingresa un valor");
        Scanner tecla = new Scanner (System.in);
        usuario =tecla.nextInt();
        
        int suma = 0;
        int media = 0;
        int v1 = 0;
        while (v1 < usuario){
            v1++;
            suma = suma +v1;
            media = suma/usuario;
        }
        System.out.println(media);
        
    } 
    public static void Actividad3_4() {
        
        System.out.println("Actividad 3.3 // Suma, promedio, mayor o menor y distancia numérica de usuario");
        
        System.out.print("Introduce tu primer valor: ");
        int valor2 = 0;
        Scanner usuario2 = new Scanner (System.in);
        valor2 = usuario2.nextInt ( );
        
        System.out.print("Introduce tu segundo valor: ");
        int valor3 = 0;
        Scanner usuario3 = new Scanner (System.in);
        valor3 = usuario3.nextInt ( );
        
        int suma = valor2 + valor3;
        System.out.println("La suma de " + valor2 + "  más " + valor3 + " es " + suma);
        
        int promedio = suma / 2;
        
        System.out.println("Tu el promedio es: " + promedio);
        
        if (valor2 > valor3) {
            System.out.println(valor2 + " es mayor que " + valor3);
        }if (valor3 > valor2) {
            System.out.println(valor3 + " es mayor que " + valor2);
        }if (valor2 == valor3) {
            System.out.println("Tus valores son iguales");
        }
       
        if (valor2 < valor3) {
            System.out.println("La distancia numerica: ");
            int d = valor2;
        while (d < valor3) {
            d++;
            System.out.println(d);
            
          }
        }if (valor3 < valor2) {
            System.out.println("Distancia numerica: ");
            int e = valor3;
            while (e  < valor2) {
                e++;
                System.out.println(e);
        }
        }
                
        
        
    }
        
        
    public static void main(String[] args) {
        // TODO code application logic here
        
        Actividad3_1();
//        Actividad3_2();
//        Actividad3_3();
//        Actividad3_4();

        
       
    }
        
    
}
