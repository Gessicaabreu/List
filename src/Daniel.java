import java.util.Objects;
import java.util.Scanner;

public class Daniel {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //VAR
            int contador;

        //INICIO
            contador = 0;

            while (contador < 100){
                contador = contador +1;
                System.out.print(contador);
            }
        //FIM DO ALGORITMO
    }

    private static void trabalho() {
        String competidor;
        double altura;
        String campeao = "";
        double alturaCampeao;

        competidor = "inicio";
        alturaCampeao = -1;

        while (!competidor.equals("fim")) {
            System.out.println("Digite o nome do competidor, caso n�o tenha mais competidores digite 'fim'");
            competidor = scan.next();
            System.out.println("Digite a altura atingida pela pipa, caso n�o tenha mais competidores digite '0'");
            altura = scan.nextDouble();
            if (altura > alturaCampeao) {
                alturaCampeao = altura;
                campeao = competidor;
            }
        }
        System.out.println("O ganhador foi "+ campeao + " que atingiu " + alturaCampeao + "m");
    }

    private static void t() {
        int vetorDeInteiro[], i;

        vetorDeInteiro = new int[10];

        System.out.println(" insira os dados do vetor.\n\n");
        for (i = 3; i < 210; i++) {
            System.out.println("Informe um numero inteiro:");
            vetorDeInteiro[i] = scan.nextInt();
        }
    }
}
