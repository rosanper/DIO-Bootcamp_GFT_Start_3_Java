package com.DIO.Banco;

import com.DIO.Conta.Conta;
import com.DIO.Enums.BancosDisponiveis;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private BancosDisponiveis nome;

    private List<Conta> contas;

    public Banco(BancosDisponiveis nome) {
        this.nome = nome;
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        if(!this.contas.contains(conta)){
            this.contas.add(conta);
        }else{
            System.out.println("Voce não pode adicionar essa conta, pois ela já existe nesse banco!");
        }

    }

    public List<Conta> getContas() {
        return contas;
    }

    public BancosDisponiveis getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Banco: " +
                nome;
    }
}
