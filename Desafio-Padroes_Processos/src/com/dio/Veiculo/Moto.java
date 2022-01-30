package com.dio.Veiculo;

public class Moto implements Veiculo{

    protected String nome;
    protected String tipo = "Moto";
    protected String numeroRodas = "2";
    private double valor = 8000;

    public Moto(String nome) {
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
