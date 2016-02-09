package br.com.gessica;

import java.util.Scanner;

public class Reinomarmoca {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String name1;
        String name2;
        String name3;
        int numdonzela,noiv1,noiv2,noiv3;

        System.out.println("Donzela, escolha um número de 1 à 10");
        numdonzela = scanner.nextInt();
        System.out.println("Qual o nome do primeiro pretendente?");
        name1 = scanner.next();
        System.out.println(name1+", escolha um número de 1 à 10");
        noiv1 = scanner.nextInt();
        System.out.println("Qual o nome do segundo pretendente?");
        name2 = scanner.next();
        System.out.println(name2+", escolha um número de 1 à 10");
        noiv2 = scanner.nextInt();
        System.out.println("Qual o nome do terceiro pretendente?");
        name3 = scanner.next();
        System.out.println(name3+", escolha um número de 1 à 10");
        noiv3 = scanner.nextInt();
        if (noiv1==numdonzela) {
            System.out.println("Parabéns "+name1+"! você ganhou a Donzela");
        }
        if (noiv2==numdonzela) {
            System.out.println("Parabéns "+name2+"! você ganhou a Donzela");
        }
        if (noiv3==numdonzela) {
            System.out.println("Parabéns "+name3+"! você ganhou a Donzela");
        }
        if (numdonzela!=noiv1 && numdonzela!=noiv2 && numdonzela!=noiv3) {
            System.out.println("Não foi dessa vez Donzela! Você ficará solteira mais 1 ano.");

        }





    }

}
