package br.com.alura.filmezao.calculos;

import br.com.alura.filmezao.modelos.Titulo;

public class Recomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao()>= 4){
            System.out.println("esta entre os preferidos");
        } else if (classificavel.getClassificacao()>=2) {
            System.out.println("muito bem avaliado");
        }
        else {
            System.out.println("titulo ruim");
        }
    }
}
