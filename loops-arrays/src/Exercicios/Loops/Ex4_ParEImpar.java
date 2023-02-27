package Exercicios.Loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numero;
        int digitados = 0;
        int somaPar = 0, somaImpar = 0;

        System.out.print("Digite um número ou 0 para encerrar: ");
        numero = scan.nextInt();

        while (numero !=0) {
            System.out.print("Digite um número ou 0 para encerrar: ");
            numero = scan.nextInt();

            if (numero%2 == 0) {
                ++somaPar;
                ++digitados;
            } else {
                ++somaImpar;
                ++digitados;
            }
        };

        System.out.println("");
        System.out.println("Numeros digitados: " + digitados);
        System.out.println("Soma dos pares: " + somaPar);
        System.out.println("Soma dos impares: " + somaImpar);

    }
}
