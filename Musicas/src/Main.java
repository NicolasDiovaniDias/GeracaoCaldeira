import Modelos.Musica;
import Modelos.Audio;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Musica shineon = new Musica();
        shineon.curte();
        shineon.curte();
        shineon.curte();
        shineon.curte();
        shineon.curte();
        System.out.println(shineon.gettotalCurtidas());
    }
}