import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        Scanner Leitor = new Scanner(System.in);
        System.out.println("registro: ");
        String registro = Leitor.next();
        LocalDate DataAtual = LocalDate.now();
        LocalTime DataFutura = LocalTime.parse("14:04");
        LocalTime HoraAtual = LocalTime.now();
        System.out.println("Registro: "+registro+"\nData: "+DataAtual+"\nHora: "+HoraAtual.format(formato));
        Duration duracao = Duration.between(HoraAtual,DataFutura);
        System.out.println(duracao);
    }
}