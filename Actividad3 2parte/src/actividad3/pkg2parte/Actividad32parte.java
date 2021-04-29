/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3.pkg2parte;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Actividad32parte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calcular la media de la suma del 0 hasta el número introducido por el usuario
        System.out.println("Ejercicio 4:");
        Scanner leer = new Scanner (System.in);
        int sum = 0;
        int num = 0;
        int cont = leer.nextInt();
        for (int i = cont; i >=0 ; i--) {
            sum= sum + num;
            num++;
        }
        float media = sum/cont;
        System.out.println("la media es:"+media);
        
        
        //Imprima un arreglo que tenga los nombres de los días de la semana
         System.out.println("Ejercicio 6");
        String[] diasSem;
        diasSem = new String[7];
        diasSem [0] = "Lunes";
        diasSem [1] = "Martes";
        diasSem [2] = "Miercoles";
        diasSem [3] = "Jueves";
        diasSem [4] = "Viernes";
        diasSem [5] = "sabado";
        diasSem [6] = "domingo";
        for (String diasSem1 : diasSem) {
            System.out.println(diasSem1);

        } 
    }
}
