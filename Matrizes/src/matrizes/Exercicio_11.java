//Faça um algoritmo que receba uma matriz A[12][12] e 
//retorna um vetor com a soma
//de cada uma das linhas de A .
package matrizes;

import java.util.Scanner;


public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int matA[][] = new int[12][12];
        int valor = 0;
        for (int i = 0; i < 12; i++){
           for (int j = 0; j < 12; j++){
               System.out.println("Digite o valor matA (" + i + "-" + j +"): ");
               matA[i][j] = ler.nextInt();
                              
           }
      }
       for( int i = 0; i < 12; i++){
          for (int j = 0; j < 12; j++){ 
          valor = matA[i][j] + 2;
       }
            
            
       }
          for( int i = 0; i < 12; i++){
              for (int j = 0; j < 12; j++){
               System.out.println("Valor matA (" + i + "-" + j +"): ");
              }
          }
            
        }  
       
}
