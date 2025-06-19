package br.com.alura.filmezao.calculos;

import br.com.alura.filmezao.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;
    public int getTempoTotal(){
        return this.tempoTotal;
    }
//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }
    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
