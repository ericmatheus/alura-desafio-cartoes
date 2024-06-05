package br.com.eric.desafio.principal;

import br.com.eric.desafio.display.Display;
import br.com.eric.desafio.modelo.Banco;
import br.com.eric.desafio.modelo.Cartao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner getData = new Scanner(System.in);
        Cartao cartaoTemporario;
        int opcao;
        do{

            Display.mostraMenu();
            opcao = getData.nextInt();
            switch (opcao) {
            case 1:
                Banco.cadastraCartao();
                break;
            case 2:

                System.out.println("CADASTRO DE COMPRA: ");
                Banco.mostraCartoes();
                System.out.println("Digite o nome do cartao");
                Scanner getData2 = new Scanner(System.in);
                String nome = getData2.nextLine();
                cartaoTemporario = Banco.buscaCartaoPorNome(nome);
                cartaoTemporario.cadastraCompra();
                break;
            case 3:
                System.out.println("======= LISTA DE COMPRAS =======");
                System.out.println("Cartoes: ");
                Banco.mostraCartoes();
                System.out.print("Digite o nome do cartão: ");
                Scanner getData3 = new Scanner(System.in);
                cartaoTemporario = Banco.buscaCartaoPorNome(getData3.nextLine());
                cartaoTemporario.listarCompras();
                break;
            case 4:
                Banco.mostraCartoes();
                break;
            case 0:
                opcao = 0;
                break;
            }
        }while (opcao != 0) ;


    }
}