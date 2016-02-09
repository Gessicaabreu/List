package br.com.gessica;

import java.util.Scanner;

public class Media {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float not1, not2, not3, not4;
        float result;
        not1 = scanner.nextInt();
        not2 = scanner.nextInt();
        not3 = scanner.nextInt();
        not4 = scanner.nextInt();
        result = (not1 + not2 + not3 + not4) / 4;
        if (result >= 7)
            System.out.println("A média é " + result + " Você foi Aprovado");
        else
            System.out.println("A média é " + result + " Você foi Reprovado");


    }
}