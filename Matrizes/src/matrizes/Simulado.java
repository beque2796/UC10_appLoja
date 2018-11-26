package matrizes;

import java.util.Scanner;

public class Simulado {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] vetorsoma = new int[5];
        int[] vetorproduto = new int[5];
        int somaproduto = 0;
        int negativo = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um valor: ");
            vetor1[i] = ler.nextInt();
            if (vetor1[i] < 0) {
                negativo++;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um valor: ");
            vetor2[i] = ler.nextInt();
            if (vetor2[i] < 0) {
                negativo++;
            }
        }

        for (int i = 0; i < 5; i++) {
            vetorsoma[i] = vetor1[i] + vetor2[i];
            vetorproduto[i] = vetor1[i] * vetor2[i];
            somaproduto = somaproduto + vetorproduto[i];
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Soma  " + vetorsoma[i]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Produto:  " + vetorproduto[i]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor1[i] + " - ");
        }
        System.out.print("\n\nvetor2");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor2[i] + " - " );
        }
        System.out.print("\n\nsomaproduto");
        for (int i = 0; i < 5; i++) {
            System.out.print("Soma do Produto:  " + somaproduto);
        }
        System.out.print("\n\nnegativo" + negativo);
        System.out.print(");
                    
        }

   
