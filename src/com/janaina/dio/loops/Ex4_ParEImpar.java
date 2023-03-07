package com.janaina.dio.loops;
import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
e mostre a quantidade de números pares
e a quantidade de números impares.
 */
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int i = 0;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantos números você quer inserir? ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Número " + (i+1) + ":");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            i++;
        } while(i < quantNumeros);

        System.out.println("Quantidade de números pares: " + quantPares);
        System.out.println("Quantidade de números ímpares: " + quantImpares);
    }
}
