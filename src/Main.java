import sun.nio.ch.IOUtil;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// pag 72
public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void percorrendoArray(){
        int numeroInteiro = 123456798;
                            //   0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18
        int[] arrayDeInteiros = {9,8,7,6,5,4,3,2,1,0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrayDois = new int[10];

        System.out.println();

        for(int i = 0; i < arrayDeInteiros.length;i++){
            System.out.print("o conteudo do aarray na posicao " + i + " ehé " + arrayDeInteiros[i] + " ");
            arrayDeInteiros[i] = arrayDeInteiros[i] + i;
            System.out.println(" o valor da soma eh: " + arrayDeInteiros[i]);
        }
        int n = 1357;
        n = n / 2;
        n = 2;
        n--;

    }


    public static void main(String[] args) throws IOException {

        byte b;//1 byte
        short s; //4
        int i;
        long l;


        int idade = leiaInteiro();
        escreva(idade);
        if(idade > 18)
            escreva("maior de idade");
        else
            escreva("menor de idade");

    }


    public static void escreva(Object texto) {
        System.out.println(texto);
    }

    public static int leiaInteiro(){
        return scan.nextInt();
    }

    public static String leiaString(){
        return scan.nextLine();
    }

    public static boolean tem4Letras(String texto) {
        final int quanntiaDeLetras = texto.length();
        return quanntiaDeLetras == 4;
    }

    private static void escolhaSexo() {
        char masculino = 'M';
        char feminino = 'F';

        char sexo = JOptionPane.showInputDialog("Informe o seu sexo digitando M ou F").toUpperCase().charAt(0);

        boolean digitouCorreto = sexo == masculino || sexo == feminino;

        if (digitouCorreto) {
            if (sexo == masculino) {
                System.out.println("sexo masculino");
            } else {
                System.out.println("sexo feminino");
            }
        } else {
            System.out.println("sexo incorreto");
            escolhaSexo();
        }
    }

    private static void calibrarTodosOsPneus(Carro carro) {
        System.out.println("---------- calibrando pneus do " + carro.modelo);
        for (int i = 0; i < carro.pneus.length; i++) {
            Pneu pneu = carro.pneus[i];
            BombaDeAr.calibrar(pneu);
        }
    }
}
