package br.com.alura.filmezao.principal;

import br.com.alura.filmezao.modelos.Filme;
import br.com.alura.filmezao.modelos.Serie;
import br.com.alura.filmezao.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme Filme1 = new Filme("Gente Grande 2",2014);
        Filme Filme2 = new Filme("Invocação do mal",2017);
        Filme Filme3 = new Filme("batalha dos aflitos", 2000);
        Serie Serie1 = new Serie("The Walking Dead",2012);

        Filme1.avalia(10);
        Filme1.avalia(9);
        Filme1.avalia(10);
        List<Titulo> Lista = new ArrayList<>();
        Lista.add(Filme1);
        Lista.add(Filme2);
        Lista.add(Filme3);
        Lista.add(Serie1);
        for(Titulo item: Lista){
            System.out.println("Nome: "+item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 0){
                System.out.println("Classificação: "+filme.getClassificacao());
            }
        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Samdler");
        buscaPorArtista.add("paulo andre");
        buscaPorArtista.add("nicolas");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        Collections.sort(Lista);
        System.out.println(Lista);
        Lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(Lista);
    }
}
