package br.com.alura.filmezao.modelos;

import br.com.alura.filmezao.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public Filme(String nome,int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (this.getSomaDasAvaliacoes()/this.getTotalDeAvaliacoes());
    }

    @Override
    public String toString() {
        return "Filme: "+this.getNome()+"\nano de lançamento: "+getAnoDeLancamento();
    }
}
