/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner n=new Scanner(System.in);
        
        int opcion = leer.nextInt();
        
        switch(opcion)
        {
            case 1 :
                System.out.println("opcion 1");
                break;
            case 2 :
                System.out.println("opcion 2");
                break;
            case 3 :
                System.out.println("opcion 3");
                break;
            case 4:
                System.out.println("opcion 4");
                break;
            case 5:
                System.out.println("opcion 5");
                break;
                
            default :
                System.out.println("invalido");
        }
    
    System.out.println("----------Ejercicio 2----------");    
         String acción = leer.next();   
         switch(acción)
        {
            case "correr" :
                System.out.println("egiste correr");
                break;
            case "mover" :
                System.out.println("elegiste mover");
                break;
            case "ver" :
                System.out.println("elegiste ver");
                break;
            case "saltar":
                System.out.println("elegiste saltar");
                break;
            case "caminar":
                System.out.println("elegiste caminar");
                break;
                
            default :
                System.out.println("no escogiste nada");
        }
        System.out.println(""
                 + "*******[Tercer ejercicio]*******");  
                     System.out.println("Hoy es Martes");
        System.out.println("Por favor introduzca un número del 1-24: ");
            int ld= entrada.nextInt();
        
        switch(ld){
            case 1: System.out.println("A las 6:30- Despertar");
            break;
            case 2: System.out.println("A las 6:35-Lavarse los dientes y la cara");
            break;
            case 3: System.out.println("A las 7:00-Clases de administración general");
            break;
            case 4: System.out.println("A las 8:00-Clases de administración general");
            break;
            case 5: System.out.println("A las 8:30-Desayunar");
            break;
            case 6: System.out.println("A las 9:00-Clases de Ingles");
            break;
            case 7: System.out.println("A las 10:00-Clases de ingles");
            break;
            case 8: System.out.println("A las 11:00-Estirarme un poco");
            break;
            case 9: System.out.println("A las 11:30-Descansar un rato los ojos");
            break;
            case 10: System.out.println("A las 12:00-Empezar a hacer tarea");
            break;
            case 11: System.out.println("A las 13:00-Calentar la comida");
            break;
            case 12: System.out.println("A las 13:20-Ver si la comida ya esta calentada");
            break;
            case 13: System.out.println("A las 14:00-Seguir haciendo tarea");
            break;
            case 14: System.out.println("A las 15:00-Limpiar la casa");
            break;
            case 15: System.out.println("A las 16:30-Hacer ejercicio");
            break;
            case 16: System.out.println("A las 17:00-Bañarme");
            break;
            case 17: System.out.println("A las 18:00-Descansar");
            break;
            case 18: System.out.println("A las 19:30-Dibujar");
            break;
            case 19: System.out.println("A las 20:30-Cenar");
            break;
            case 20: System.out.println("A las 21:00-Volver a bañarme");
            break;
            case 21: System.out.println("A las 21:30-Terminar de dibujar");
            break;
            case 22: System.out.println("A las 22:30-Acostarme");
            break;
            case 23: System.out.println("A las 23:30-Dormir");
            break;
            case 24: System.out.println("A las 24:00-Estar dormida");
            break;
            
            default:
                System.out.println("Se termino el horario");
        }
         System.out.println(""
                 + "*******[Cuarto ejercicio]*******");
         
         System.out.println("Por favor introduzca un número del 1-7: ");
        int dia= entrada.nextInt();
        
        switch(dia){
            case 1: System.out.println("Domingo");
            break;
            case 2: System.out.println("Lunes");
            break;
            case 3: System.out.println("Martes");
            break;
            case 4: System.out.println("Miércoles");
            break;
            case 5: System.out.println("Jueves");
            break;
             case 6: System.out.println("Viernes");
            break;
            case 7: System.out.println("Sábado");
            break;
            default:
                System.out.println("Fecha no valida");
        }
                if (dia==1){
                System.out.println("Semana inglesa");
                }         
                else {
                System.out.println("Semana laboral");
                }
    }
    
}
