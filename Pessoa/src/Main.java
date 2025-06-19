import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa nicolas = new Pessoa();
        Pessoa caua = new Pessoa();
        Pessoa joao = new Pessoa();
        nicolas.setNome("nicolas");
        joao.setNome("caua");
        caua.setNome("joao");
        nicolas.setIdade(18);
        caua.setIdade(18);
        joao.setIdade(19);
        System.out.println(nicolas.toString());
        ArrayList<Pessoa> ListaPessoas = new ArrayList<>();
        ListaPessoas.add(nicolas);
        ListaPessoas.add(caua);
        ListaPessoas.add(joao);
        for (int i = 0;i<ListaPessoas.size();i++){
            System.out.println(ListaPessoas.get(i).toString());
        }
    }
}