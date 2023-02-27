package Exercicios.Loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial;
        int resultado;

        System.out.print("Digite um número maior que 0: ");
        fatorial = scan.nextInt();

        while(fatorial < 0){
            System.out.print("Número inválido! Digite um número maior que 0: ");
            fatorial = scan.nextInt();
        }

        resultado = fatorial;
        if (resultado == 0){
            System.out.print(resultado + "! = " + resultado);
        } else {
            System.out.print(fatorial + "! = " + fatorial);
            for (int i = (fatorial-1); i >= 1; --i){
                 resultado *= i;
                System.out.print(" X " + i);
            };

            System.out.print(" = " + resultado);
        }

    }
}
