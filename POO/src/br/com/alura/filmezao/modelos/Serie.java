package br.com.alura.filmezao.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTeporada;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTeporada() {
        return episodiosPorTeporada;
    }

    public void setEpisodiosPorTeporada(int episodiosPorTeporada) {
        this.episodiosPorTeporada = episodiosPorTeporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "serie: "+getNome()+"\nanoLançamento: "+getAnoDeLancamento();
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTeporada * minutosPorEpisodio;
    }

}
