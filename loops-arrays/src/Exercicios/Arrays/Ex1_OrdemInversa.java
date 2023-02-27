package Exercicios.Arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = {2, -5, 25, 7, 3, 1};
        
        for(int i= (vetor.length - 1); i >= 0 ; i--){
            System.out.print(vetor[i] + " ");
        }

    }
}
