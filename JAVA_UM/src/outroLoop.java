import java.util.Scanner;
public class outroLoop {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int divisao = 0;
        while (nota!=-1){
            System.out.println("qual é a nota? ");
            nota = leitor.nextDouble();
            if(nota != -1){
                media += nota;
                divisao ++;
            }
        }
        System.out.println(media/divisao);
    }
}
