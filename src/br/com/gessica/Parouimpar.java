package br.com.gessica;

import java.util.Scanner;

public class Parouimpar {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number = scanner.nextInt();
        if (number % 2 == 0)
            System.out.println("O número " + number + " é par");
        else
            System.out.println("O número " + number + " é ímpar");

    }

}