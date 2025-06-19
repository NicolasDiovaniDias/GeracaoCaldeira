import moedas.modelos.Pesos;
import moedas.modelos.Real;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Real real = new Real();
        Pesos peso = new Pesos();
        peso.setValor(100);
        peso.converterMoeda();
        real.setValor(100);
        real.converterMoeda();
    }
}