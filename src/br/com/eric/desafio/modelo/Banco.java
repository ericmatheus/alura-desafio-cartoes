package br.com.eric.desafio.modelo;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {

    private static List<Cartao> listaCartoes = new ArrayList<>();

    public static Cartao buscaCartaoPorNome(String nome){
        for(Cartao cartao : listaCartoes){
            if(cartao.getNome().equals(nome)){
                return cartao;
            }
        }
        return null;
    }

    public static void mostraCartoes(){
        System.out.println("=========== LISTA DE CARTÕES ===========");
        for(Cartao cartao : listaCartoes){
            System.out.println(cartao);
        }
        System.out.println("========================================");
    }

    public static void cadastraCartao(){
        System.out.println("=========== CADASTRO DE CARTÃO ===========");
        Scanner getData = new Scanner(System.in);
        System.out.print("Nome do Cartão: ");
        String nome;

        do {
           nome = getData.nextLine();
            if (nome.isBlank()) {
                System.out.println("Nome do cartão nao pode ser vazia");
                System.out.println("Digite novamente");
            }
        }while(nome.isBlank());

        System.out.print("Limite do Cartão: ");
        double valor;
        do{
            valor = getData.nextDouble();
            if(valor < 1){
                System.out.println("VALOR não pode ser menor que 1");
                System.out.println("Digite novamente");
            }
        }while(valor < 1);
        Cartao cartao = new Cartao(nome , valor);
        listaCartoes.add(cartao);
    }

}
