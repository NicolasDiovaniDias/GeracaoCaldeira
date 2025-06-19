package moedas.modelos;

import moedas.calculos.ConversaoFinanceira;

public class Real extends Moeda implements ConversaoFinanceira {
    @Override
    public void converterMoeda() {
        System.out.println(this.getValor()+" Dolares em Reais: "+this.getValor()*5.5);
    }

}
