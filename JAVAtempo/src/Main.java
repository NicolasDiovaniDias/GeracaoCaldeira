import java.time.*;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela = LocalDate.of(2025,6,23);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        if(dataPrimeiraParcela.isBefore(LocalDate.now())){
            System.out.println("anterior ao dia do vencimento");
        }
        else {
            System.out.println("superior ao dia do vencimento");
        }
        System.out.println("Data compra: "+dataCompra.format(formato)+"\n" +
                "data primeira parcela: "+dataPrimeiraParcela+"\n" +
                "data segunda parcela: "+dataSegundaParcela
        );
        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        ZonedDateTime dataCompraTK = dataConclusaoCompra.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println(dataCompraTK.format(DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm")));
        LocalTime inicio = LocalTime.of(9,12);
        LocalTime fim = LocalTime.of(10,54);
        Duration duracao = Duration.between(inicio,fim);
        System.out.println(duracao);
        LocalDate dataPagamento = LocalDate.parse("2025-10-30");
        Period periodo = Period.between(dataPagamento,dataCompra);
        System.out.println("Diferença em dias: "+periodo.getDays());
    }
}