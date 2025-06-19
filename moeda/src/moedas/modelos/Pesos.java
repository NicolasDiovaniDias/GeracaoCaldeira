package moedas.modelos;

import moedas.calculos.ConversaoFinanceira;

public class Pesos extends Moeda implements ConversaoFinanceira {

    @Override
    public void converterMoeda() {
        System.out.println(this.getValor()+" Dolares em Pesos: "+this.getValor()*10.5);
    }
}
