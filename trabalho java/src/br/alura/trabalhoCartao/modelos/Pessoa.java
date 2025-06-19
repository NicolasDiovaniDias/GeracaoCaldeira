package br.alura.trabalhoCartao.modelos;

import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
    public double saldo;
    public double limite;
    ArrayList<produtos> compras = new ArrayList<>();

    Scanner leitor = new Scanner(System.in);
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    public void getcompras(){
        System.out.println("sua lista de produtos");
        for (int i = 0; i<compras.size();i++){
            System.out.println("nome: "+compras.get(i).getNome()+"\npreço: "+compras.get(i).getPreco()+"\n");
        }
        System.out.println("saldo: "+this.getSaldo());
    }
    public void setLimite(double limite) {
        while (true){
            if (limite < 0){
                System.out.println("seu limite não pode ser negativo, digite um limite positivo: ");
            }
            else {
                this.limite = limite;
                break;
            }
            limite = leitor.nextDouble();
        }
    }

    public void novaCompra(produtos produto){
        compras.add(produto);
    }
    public void calculoGeral(Pessoa pessoa1, ArrayList<produtos> produtos){
        while (true) {
            if (!produtos.isEmpty()){
                for (int i = 0; i < produtos.size(); i++) {
                    System.out.println(i + 1 + " - " + produtos.get(i).getNome());
                }
            }
            else {
                System.out.println("não possuem produtos a disposição");
                break;
            }
            System.out.println("qual produto voce quer comprar? ");
            int id = leitor.nextInt();
            if (pessoa1.limite<produtos.get(id-1).getPreco()){
                System.out.println("esse produto ultrapassa o limite do cartao");
            }
            else if (pessoa1.saldo>produtos.get(id-1).getPreco()){
                pessoa1.saldo-=produtos.get(id-1).getPreco();
                pessoa1.novaCompra(produtos.get(id - 1));
                produtos.remove(produtos.get(id - 1));
            }
            else {
                System.out.println("saldo indisponivel, saldo: "+pessoa1.getSaldo()+"\npreço do produto: "+produtos.get(id-1).getPreco());
            }
            System.out.println("voce quer comprar mais?\n1-sim\n2-não");
            String continuar = leitor.next();
            if (continuar.equals("2")) {
                break;
            } else if (continuar.equals("1")) {
                System.out.println("que bom!");
            }
            else {
                System.out.println("valor invalido");
            }

        }
        pessoa1.getcompras();
    }
}
