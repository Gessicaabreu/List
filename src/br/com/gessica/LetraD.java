package br.com.gessica;

import java.util.Scanner;

public class LetraD {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int numero;
        int numero2,numero3,numero4,milhar=0,centena,dezena;

        numero = scanner.nextInt();
        if (numero>9999)
            System.out.println("O n�mero n�o pode ser maior que 4 dig�tos");

        else {
            milhar = (numero/1000);
            if (milhar>0){
                System.out.println(milhar+" � Milhar");
            }
            numero2 = numero-(milhar*1000);
            //numero dois virou 432
            centena = (numero2/100);
            if (centena>0){
                System.out.println(centena+" � Centena");
            }
            numero3 = numero2-(centena*100);
            //numero3 virou 32

            dezena = (numero3/10);
            if (dezena>0){
                System.out.println(dezena+" � Dezena");
            }
            numero4 = numero3-(dezena*10);

            System.out.println(numero4+" � Unidade");



        }

    }
}