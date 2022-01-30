package com.DIO.Pessoa;

public class Pessoa {

    private String nome;
    private String cpf;
    private int idade;
    private String statusSocial;
    private String emprego;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", statusSocial='" + statusSocial + '\'' +
                ", emprego='" + emprego + '\'' +
                '}';
    }
}
