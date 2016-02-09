/**
 * Created by Gilson on 11/05/2015.
 */
public class BombaDeAr {

    public static void calibrar(Pneu pneu){
        while(pneu.psiAtual < pneu.maximoPsi){
            pneu.psiAtual = pneu.psiAtual +1;
        }
        System.out.println("pneu cheio");
    }
}
