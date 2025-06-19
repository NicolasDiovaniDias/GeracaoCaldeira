package br.com.alura.filmezao.principal;

import br.com.alura.filmezao.calculos.CalculadoraDeTempo;
import br.com.alura.filmezao.calculos.Recomendacao;
import br.com.alura.filmezao.modelos.Episodio;
import br.com.alura.filmezao.modelos.Filme;
import br.com.alura.filmezao.modelos.Serie;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme filmezao = new Filme("filmezao",2004);
        filmezao.setIncluidoNoPlano(true);
        filmezao.setDuracaoEmMinutos(98);
        filmezao.avalia(10);
        filmezao.avalia(3);
        filmezao.avalia(7);
        Filme sherek = new Filme("sherek",2004);
        sherek.setDuracaoEmMinutos(120);
        System.out.println("media de notas: "+filmezao.media()+"\n\n####SERIES####\n");


        Serie breakingBad = new Serie("breaking bad",2015);
        breakingBad.setTemporadas(5);
        breakingBad.setEpisodiosPorTeporada(12);
        breakingBad.setMinutosPorEpisodio(40);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filmezao);
        calculadora.inclui(sherek);
        calculadora.inclui(breakingBad);
        System.out.println(calculadora.getTempoTotal());
        Recomendacao filtro = new Recomendacao();
        filtro.filtra(sherek);
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(breakingBad);
        episodio.setTotalDeVizualizacoes(300);
        filtro.filtra(episodio);

        Filme osCarrinhos = new Filme("carrinhos",2004);
        ArrayList<Filme> ListaDeFilmes = new ArrayList<>();
        ListaDeFilmes.add(osCarrinhos);
        ListaDeFilmes.add(filmezao);
        ListaDeFilmes.add(sherek);
        int nicolas[] = new int[5];
        nicolas[0] = 2;
        System.out.println(ListaDeFilmes.get(0).getNome());
        System.out.println("tamanho da lista: "+ListaDeFilmes.size());
        System.out.println(ListaDeFilmes);
        for(int i = 0;i<ListaDeFilmes.size();i++){
            System.out.println(ListaDeFilmes.get(i).toString());
        }
    }
}