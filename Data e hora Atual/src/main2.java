import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class main2 {
    public static void main(String[] args) {
        LocalDate dataEvento = LocalDate.of(2025,8,12);
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        if (dataAtual.isBefore(dataEvento)){
            System.out.println("o evento acontecera em: "+dataEvento.format(formato));
        }
//        System.out.println(dataAtual);
//        int meses = 18;
//
//        System.out.println(dataAtual.plusMonths(meses).format(formato));
    }
}
