import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double nota = 0;
        for (int i = 0; i < 3;i++){
            System.out.println("qual é a "+(i+1)+"° nota? ");
            double nota1 = leitor.nextDouble();
            nota += nota1;
        }
        System.out.println(nota/3);
    }
}
