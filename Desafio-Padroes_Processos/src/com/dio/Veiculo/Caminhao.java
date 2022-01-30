package com.dio.Veiculo;

public class Caminhao implements Veiculo{

    protected String nome;
    protected String tipo = "Caminhão";
    protected String numeroRodas = "8";
    private double valor = 100000;

    public Caminhao(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String pegarDados() {
        return "O modelo do " + tipo + " é " + nome;
    }

    @Override
    public double mostrarValor() {
        return valor;
    }
}
