import br.alura.trabalhoCartao.modelos.Pessoa;
import br.alura.trabalhoCartao.modelos.produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Scanner leitor = new Scanner(System.in);
        produtos vestido = new produtos("vestido",200);
        produtos carro = new produtos("carro",400);
        produtos controle = new produtos("controle",500);
        ArrayList<produtos> produtos = new ArrayList<>();
        produtos.add(vestido);
        produtos.add(carro);
        produtos.add(controle);
        pessoa1.setLimite(1000);
        pessoa1.setSaldo(800);
        pessoa1.calculoGeral(pessoa1,produtos);
    }
}