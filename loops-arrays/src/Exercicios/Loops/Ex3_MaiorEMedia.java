package Exercicios.Loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior;
        int contador = 0, soma = 0;

        System.out.println("Número: ");
            numero = scan.nextInt();
            maior = numero;
            soma += numero;
            ++contador;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            soma += numero;
            if(numero>maior)maior=numero;
            ++contador;
        } while (contador < 5);

        int media = soma/5;
        System.out.println("Número maior: " + maior);
        System.out.println("Média: " + media);
    }
}
