/**
 * Created by Gilson on 11/05/2015.
 */
public class Carro {
    Pneu[] pneus = new Pneu[4];
    Pneu step;
    String cor;
    Banco[] bancos = new Banco[4];
    String marca;
    String modelo;

    Carro(){
        colocarPneus();
        colocarBancos();
    }

    private void colocarBancos() {
        for (int i = 0; i < 4; i++) {
            bancos[i] = new Banco();
        }
    }

    private void colocarPneus() {
        for (int i = 0; i < 4; i++) {
            pneus[i] = new Pneu();
        }
    }

}
