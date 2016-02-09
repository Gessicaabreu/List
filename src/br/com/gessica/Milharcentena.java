package br.com.gessica;

import java.util.Scanner;

public class Milharcentena {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int numero;
        int numero2,numero3,numero4,milhar=0,centena,dezena;
        System.out.println("Escolha um número de 4 digítos");
        numero = scanner.nextInt();
        if (numero>9999 || numero<999)
            System.out.println("O número precisa ter 4 digítos");

        else {
            milhar = (numero/1000);
            System.out.println(milhar+" é Milhar");
            numero2 = numero-(milhar*1000);
            //numero dois virou 432
            centena = (numero2/100);
            System.out.println(centena+" é Centena");

            numero3 = numero2-(centena*100);
            //numero3 virou 32

            dezena = (numero3/10);
            System.out.println(dezena+" é Dezena");

            numero4 = numero3-(dezena*10);

            System.out.println(numero4+" é Unidade");



        }

    }
}