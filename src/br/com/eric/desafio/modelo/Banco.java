package br.com.eric.desafio.modelo;

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
        for(Cartao cartao : listaCartoes){
            System.out.println(cartao);
        }
    }

    public static void cadastraCartao(){
        Cartao cartao = new Cartao();
        Scanner getData = new Scanner(System.in);
        System.out.print("Nome do Cartão: ");
        cartao.setNome(getData.nextLine());
        System.out.print("Limite do Cartão: ");
        cartao.setValorLimite(getData.nextDouble());
        listaCartoes.add(cartao);
    }

}
