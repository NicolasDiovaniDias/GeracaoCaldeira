//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esse é o filmando");
        System.out.println("Filme: carros 2");
        int anoDeLancamento = 2011;
        System.out.println("ano de lançamento: "+anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9;
        double media = (9.8+6.3+8)/3;
        System.out.println(media);
        String sinopse;
        sinopse = "filme dos carros maneiros, tem o relanpago \ntem o matte tbm";
        System.out.println(sinopse);
        String nome = "Nicolas";
        int aulas = 100000;
        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome, aulas);

        System.out.println(mensagem);
        int classificacao;
        classificacao = (int) (media/2);
        System.out.println(classificacao);
        /*double temperatura = 20;
        double fah = (temperatura *1.8)+32;
        System.out.println(fah);
        int num1 = 20;
        double num2 = 30.43;
        num1 = (int) num2;
        char Sexo = 54;
         */
        if(nome.equals("Nicolas")){
            System.out.println("nicolas");
        }
        switch (nome){
            case "Nicolas":
                System.out.println("aaaaaa");
                break;
        }
    }
}