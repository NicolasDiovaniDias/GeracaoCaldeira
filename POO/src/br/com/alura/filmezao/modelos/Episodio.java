package br.com.alura.filmezao.modelos;

import br.com.alura.filmezao.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;

    public int getTotalDeVizualizacoes() {
        return totalDeVizualizacoes;
    }

    public void setTotalDeVizualizacoes(int totalDeVizualizacoes) {
        this.totalDeVizualizacoes = totalDeVizualizacoes;
    }

    private int totalDeVizualizacoes;

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getClassificacao() {
        if(totalDeVizualizacoes>100){
            return 4;
        }
        else {
            return 2;
        }
    }
}
