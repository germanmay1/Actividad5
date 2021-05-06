/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg5;

/**
 *
 * @author User
 */
public class Actividad5 {

    /**
     * @param args the command line arguments
     */
    public static void Actividad1() {
        // TODO code application logic here
         String[] DiaDeLaSemana;
        DiaDeLaSemana = new String[7];
        DiaDeLaSemana [0]= "Lunes";
        DiaDeLaSemana [1]= "Martes";      
        DiaDeLaSemana [2]= "Miercoles";
        DiaDeLaSemana [3]= "Jueves";
        DiaDeLaSemana [4]= "Viernes";
        DiaDeLaSemana [5]= "Sabado";
        DiaDeLaSemana [6]= "Domingo";
        
        for (String DiaSem:DiaDeLaSemana){
            System.out.println(DiaSem);
            }
        }
    public static void Actividad2() {
        String sWar[][] = new String[3][4];
        sWar[0][0] = "Darth Vader";
        sWar[0][1] = "Luke Skywalker";
        sWar[0][2] = "Han solo";
        sWar[0][3] = "Lea Organa";
        sWar[1][0] = "Obi-Wan Kenobi";
        sWar[1][1] = "Chewbacca";
        sWar[1][2] = "Yoda";
        sWar[1][3] = "Palpatine";
        sWar[2][0] = "R2-D2";
        sWar[2][1] = "Darth Maul";
        sWar[2][2] = "Boba Fett";
        sWar[2][3] = "C-3PO";
        int i, j;
        for (i = 0; i < sWar.length; i++) {
            for (j = 0; j < sWar[i].length; j++) {
                System.out.print("[" + sWar[i][j] + "]");

            }
        }
    }

    public static void Actividad3() {
        String[][] aCodigo;
        aCodigo = new String[26][2];
        aCodigo[0][0] = "A";
        aCodigo[1][0] = "B";
        aCodigo[2][0] = "C";
        aCodigo[3][0] = "D";
        aCodigo[4][0] = "E";
        aCodigo[5][0] = "F";
        aCodigo[6][0] = "G";
        aCodigo[7][0] = "H";
        aCodigo[8][0] = "I";
        aCodigo[9][0] = "J";
        aCodigo[10][0] = "K";
        aCodigo[11][0] = "L";
        aCodigo[12][0] = "M";
        aCodigo[13][0] = "N";
        aCodigo[14][0] = "O";
        aCodigo[15][0] = "P";
        aCodigo[16][0] = "Q";
        aCodigo[17][0] = "R";
        aCodigo[18][0] = "S";
        aCodigo[19][0] = "T";
        aCodigo[20][0] = "U";
        aCodigo[21][0] = "V";
        aCodigo[22][0] = "W";
        aCodigo[23][0] = "X";
        aCodigo[24][0] = "Y";
        aCodigo[25][0] = "Z";

        // MORSE
        aCodigo[0][1] = ".-";
        aCodigo[1][1] = "-...";
        aCodigo[2][1] = "-.-.";
        aCodigo[3][1] = "-..";
        aCodigo[4][1] = ".";
        aCodigo[5][1] = "..-.";
        aCodigo[6][1] = "--.";
        aCodigo[7][1] = "...";
        aCodigo[8][1] = "..";
        aCodigo[9][1] = ".---";
        aCodigo[10][1] = "-.-";
        aCodigo[11][1] = ".-..";
        aCodigo[12][1] = "--";
        aCodigo[13][1] = "-.";
        aCodigo[14][1] = "---";
        aCodigo[15][1] = ".--.";
        aCodigo[16][1] = "--.-";
        aCodigo[17][1] = ".-.";
        aCodigo[18][1] = "...";
        aCodigo[19][1] = "-";
        aCodigo[20][1] = "..-";
        aCodigo[21][1] = "...-";
        aCodigo[22][1] = ".--";
        aCodigo[23][1] = "-..-";
        aCodigo[24][1] = "-.--";
        aCodigo[25][1] = "--..";

        for (int i = 0; i < 26; i++) {
            String[] strings = aCodigo[i];
            for (int j = 0; j < 2; j++) {
                String string = strings[j];
                System.out.println(aCodigo[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        //Actividad1();
        //Actividad2();
        //Actividad3();
        }
    
    
}
