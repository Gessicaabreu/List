package br.com.gessica;

import java.util.Scanner;

public class letraF {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        float not1, not2, not3, not4, result = 0;
        not1 = scanner.nextInt();
        not2 = scanner.nextInt();
        not3 = scanner.nextInt();
        not4 = scanner.nextInt();
        if (not1 < not2 && not1 < not3 && not1 < not4) {
            result = (not2 + not3 + not4) / 3;
        }
        if (not2 < not1 && not2 < not3 && not2 < not4) {
            result = (not1 + not3 + not4) / 3;
        }
        if (not3 < not2 && not3 < not1 && not3 < not4) {
            result = (not1 + not2 + not4) / 3;
        }
        if (not4 < not1 && not4 < not2 && not4 < not3) {
            result = (not1 + not2 + not3) / 3;
        }
        if (result >= 7)
            System.out.println("A média é " + result + " Você foi Aprovado");
        else
            System.out.println("A média é " + result + " Você foi Reprovado");


    }

}