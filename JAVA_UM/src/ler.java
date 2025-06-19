import java.util.Scanner;

public class ler {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("digite seu filme: ");
        String filme = leitor.nextLine();
        System.out.println(filme);
        System.out.print("digite o ano de lançamento: ");
        int ano = leitor.nextInt();
        System.out.println(ano);
        System.out.println("qual a nota do filme? ");
        double nota = leitor.nextDouble();
        System.out.println(nota);
    }
}
