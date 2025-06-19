import java.util.Scanner;

public class banco {
    public static void adicionar_saldo(double num){
        Scanner Leitor = new Scanner(System.in);
        String adicionar;
        do{
            System.out.println("saldo atual: R$"+num);
            System.out.println("voce quer adicionar mais?\n1-sim\n2-não");
            adicionar = Leitor.next();
            if (adicionar.equals("2")){
                break;
            } else if (adicionar.equals("1")) {
                System.out.println("quanto voce quer adicionar no saldo?");
                double novo_saldo = Leitor.nextDouble();
                num += novo_saldo;
            }
            else {
                System.out.println("valor invalido");
            }
        }
        while(!adicionar.equals("2"));
    }
    public static void main(String[] args) {
        double saldo = 0;
        System.out.println();
        adicionar_saldo(saldo);
    }
}
