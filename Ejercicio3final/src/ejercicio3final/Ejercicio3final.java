/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3final;

/**
 *
 * @author User
 */
public class Ejercicio3final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Imprima un arreglo de 2 dimensiones de 3 X 3 que dibuje el modelo del juego gato.
        System.out.println("Modelo del gato");
        char cat[][]= new char[3][3];
        cat[0][0]='o';
        cat[0][1]='x';
        cat[0][2]='o';
        cat[1][0]='x';
        cat[1][1]='o';
        cat[1][2]='x';
        cat[2][0]='o';
        cat[2][1]='x';
        cat[2][2]='o';
        for (int i = 0; i < cat.length; i++) {
            System.out.println("|" + cat[i][0]+"|" + cat[i][1]+"|"+cat[i][2]+"|");
        }
        
    }
    
}
