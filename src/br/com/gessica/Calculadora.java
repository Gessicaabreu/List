package br.com.gessica;

import java.util.Objects;
import java.util.Scanner;


public class Calculadora {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float num1,num2;
        String symbol;
        float result;

        num1 = scanner.nextInt();
        symbol =scanner.next();
        num2 = scanner.nextInt();

        if ("+".equals(symbol)) {
            result = (num1 + num2);
            System.out.println(result);
        }
        if (Objects.equals(symbol, "-")) {
            result = (num1-num2);
            System.out.println(result);
        }
        if (symbol=="*") {
            result = (num1*num2);
            System.out.println(result);
        }
        if (symbol=="/") {
            result = (num1/num2);
            System.out.println(result);
        }

    }

}