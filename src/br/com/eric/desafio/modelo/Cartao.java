package br.com.eric.desafio.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cartao {
    String nome;
    double valorLimite;
    double saldo;
    List<Produto> listaProdutos = new ArrayList<>();

    public Cartao(String nome, double valorLimite){
        this.valorLimite = valorLimite;
        this.saldo = valorLimite;
        this.nome = nome;
    }

    public void listarCompras(){
        for(Produto produto : listaProdutos){
            System.out.println(produto);
        }
    }

    public void cadastraCompra(){
        Produto produto = new Produto();
        Scanner getData = new Scanner(System.in);
        System.out.println("CADASTRO DE PRODUTO: ");
        System.out.println("Nome: ");
        produto.setNome(getData.nextLine());
        System.out.println("Valor: ");
        produto.setValor(getData.nextDouble());
        if(produto.getValor() > this.saldo){
            System.out.println("SALDO INSUFICIENTE!!!");
        }else {
            listaProdutos.add(produto);
            saldo -= produto.getValor();
            System.out.println("COMPRA ACEITA!");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValorLimite(double valorLimite) {
        this.valorLimite = valorLimite;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "| - Limite: " + valorLimite + "| Saldo: " + saldo;
    }
}
