package com.janaina.dio.loops;
import java.util.Scanner;
/*
Faça um programa que peça para o usuário criar uma senha
Caso insira a senha incorreta, mostre uma mensagem de erro
Coloque um limite de 2 tentativas para inserir a senha correta.

(adaptado por Janaina G. de um exercício de Python das aulas de Bases Computacionais na UFABC)
 */
public class ExExtra_Senha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int senha;
        boolean estaCorreta = false;

        System.out.println("Defina sua nova senha.\nAtenção: Use apenas números!\nNova senha: ");
        senha = scan.nextInt();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Insira a nova senha para fazer o login: ");
            int novaSenha = scan.nextInt();

            if (novaSenha == senha) {
                estaCorreta = true;
                System.out.println("Senha correta! Aguarde o login...");
                break;
            } else {
                System.out.println("Ops! Senha errada. Você tem apenas " + (3 - i) + " tentativa(s).");
            }
        }

        if (!estaCorreta) {
            System.out.println("Sinto muito, você ultrapassou o limite de tentativas. Tente novamente mais tarde.");
        }
    }
}
