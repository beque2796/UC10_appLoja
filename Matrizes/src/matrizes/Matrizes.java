
package matrizes;

import java.util.Scanner;


public class Matrizes {

     public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         
        int mat [][] = new int [3][4]; 
        int cont = 1;
        for (int i = 0; i < 3; i++){
        for (int j = 0; i < 4; i++){
            mat[i][j] = cont;
            cont++;
            
        }
    }
        for (int i = 0; i < 3; i++){
        for (int j = 0; i < 4; i++){
            System.out.print( mat[i][j] + " - ");
            
            
        } 
            System.out.println("\n------------");
       }
     }
           
}
