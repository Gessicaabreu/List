/**
 * Created by Gilson on 03/10/2015.
 */
public class Aula {

    public static void main(String[] args) {


        int[] vetor = new int[10];
        int cont=10;
        for (int i=0;i<10; i++) {

            vetor[i] = cont--;

        }

        for (int i = 0; i < 10; i++) {


            System.out.println(vetor[i]);


        }


    }

}
