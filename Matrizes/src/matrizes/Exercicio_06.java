//Faça um algoritmo que receba duas matrizes A[4][4] e B[4][4] e 
//retorna uma matriz
//C, que seja a soma de A com B.
package matrizes;

import java.util.Scanner;

public class Exercicio_06 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int matA[][] = new int[4][4];
        int matB[][] = new int[4][4];
        int matC[][] = new int[4][4];
        
        for (int i = 0; i < 4; i++){
           for (int j = 0; j < 4; j++){
               System.out.println("Digite o valor matA (" + i + "-" + j +"): ");
               matA[i][j] = ler.nextInt();
               
                       
            }
        }
        for (int i = 0; i < 4; i++){
           for (int j = 0; j < 4; j++){
               System.out.println("Digite o valor matB (" + i + "-" + j +"): ");
               matB[i][j] = ler.nextInt();
               
                       
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               matC[i][j] = matA[i][j] + matB[i][j];
                
            }
            
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print( matC[i][j] + " - ");
                
            }
            System.out.println("\n------------------");
        }
          
       }
}
