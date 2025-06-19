package principal;

import Modelos.MinhasPreferidas;
import Modelos.Musica;

public class principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        for (int i =0; i <201;i++){
            musica.reproduz();
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica);

    }
}
