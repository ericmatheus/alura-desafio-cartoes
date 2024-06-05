package br.com.eric.desafio.modelo;

public class Produto {

    private String nome;
    private  double valor;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Compra: " + nome + "Valor: " + valor;
    }
}
