package com.janaina.dio.loops;
import java.util.Scanner;

/*
Desenvolva um gerador de tabuada de qualquer número inteiro entre 1 e 10.
O usuario deve informar qual número ele deseja ver a tabuada.
 */
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quero ver a tabuada do número: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada do " + tabuada);

        for (int i = 1; i<= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }

    }
}
