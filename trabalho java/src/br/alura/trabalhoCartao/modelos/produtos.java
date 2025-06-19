package br.alura.trabalhoCartao.modelos;

public class produtos {
    private double preco;
    private String nome;

    public produtos(String nome, double preco) {
        this.preco = preco;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "nome: "+this.nome+"\npreço: "+this.preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
