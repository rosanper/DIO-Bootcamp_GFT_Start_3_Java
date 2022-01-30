package com.DIO.Conta;

import com.DIO.Banco.Banco;
import com.DIO.Endereco.Endereco;
import com.DIO.Enums.TipoConta;
import com.DIO.Pessoa.Pessoa;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Pessoa pessoa, Banco banco, Endereco enderecoCliente) {
        super(pessoa, banco, enderecoCliente);
        this.tipoConta = TipoConta.POUPANCA;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("-- Informações Conta Poupança -- ");
        super.mostrarInformacoes();
    }
}
