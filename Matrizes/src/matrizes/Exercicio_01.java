//Faça um algoritmo que recebe uma matriz A[5][5] 
//e retorna a soma dos seus
//elementos.
package matrizes;

import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int mat[][] = new int[5][5];
        int soma = 0;

        for (int i = 0; i < 5; i++){
           for (int j = 0; j < 5; j++){
               System.out.println("Digite o valor (" + i + "-" + j +"): ");
               mat[i][j] = ler.nextInt();
               
                       
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                soma = soma + mat[i][j];
            }
            
        }
           System.out.println("Soma: " + soma);  
    }
}
