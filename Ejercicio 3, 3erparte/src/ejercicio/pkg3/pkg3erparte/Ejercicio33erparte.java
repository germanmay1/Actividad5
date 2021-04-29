/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.pkg3erparte;

/**
 *
 * @author User
 */
public class Ejercicio33erparte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Imprima utilizando los ciclos for el arreglo de dos dimensiones de los personajes de Star War.
        System.out.println("Ejercicio 7");
        String sWar[][] = new String[3][4];
        sWar[0][0]="Darth Vader";
        sWar[0][1]="Luke Skywalker";
        sWar[0][2]="Han solo";
        sWar[0][3]="Lea Organa";
        sWar[1][0]="Obi-Wan Kenobi";
        sWar[1][1]="Chewbacca";
        sWar[1][2]="Yoda";
        sWar[1][3]="Palpatine";
        sWar[2][0]="R2-D2";
        sWar[2][1]="C-3PO";
        sWar[2][2]="Boba Fett";
        sWar[2][3]="Darth Maul";
        int i,j;
        for (i = 0;i < sWar.length; i++){
            for(j = 0; j < sWar[i].length; j++){
                System.out.print("["+sWar[i][j]+"]");
                
            }
        }  
    }
    
}
