package com.janaina.dio.loops;
import java.util.Scanner;
/*
Faça um programa que peça 1 nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
Continue pedindo uma nota até que o usuário informe um valor válido.
 */
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota <0 | nota > 10) {
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scan.nextInt();
        }
    }
}
