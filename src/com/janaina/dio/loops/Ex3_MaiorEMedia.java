package com.janaina.dio.loops;
import java.util.Scanner;

/*
Faça um programa que leia 5 números e informe o maior número e a média desses números.
 */
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maiorNum = 0;
        int soma = 0;
        int i = 0;

        do {
            System.out.println("Número " + (i+1) + ": ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maiorNum) maiorNum = numero;

            i++;

        } while (i < 5);

        System.out.println("O maior número inserido foi: " + maiorNum);
        System.out.println("A média dos números inseridos é: " + (soma/5));
    }
}
