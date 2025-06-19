package Modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao()>=9){
            System.out.println("melhor musica de todos os tempos");
        }
        else {
            System.out.println("musica horrivel");
        }
    }
}
