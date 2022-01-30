package com.dio.Veiculo;

public class Carro implements Veiculo{
    protected String nome;
    protected String tipo = "Carro";
    protected String numeroRodas = "4";
    private double valor = 45000;

    public Carro(String nome) {
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
