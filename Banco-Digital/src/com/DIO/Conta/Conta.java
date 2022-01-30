package com.DIO.Conta;

import com.DIO.Banco.Banco;
import com.DIO.Endereco.Endereco;
import com.DIO.Enums.TipoConta;
import com.DIO.Pessoa.Pessoa;
import com.DIO.utils.FormatacaoLocalizacao;
import com.DIO.utils.NumeroAleatorio;
import com.DIO.utils.Verifica;

import java.text.NumberFormat;

public abstract class Conta {

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Pessoa pessoa;
    protected Banco banco;
    protected Endereco enderecoCliente;
    protected TipoConta tipoConta;


    public Conta(Pessoa pessoa, Banco banco, Endereco enderecoCliente) {
        this.pessoa = pessoa;
        this.banco = banco;
        this.enderecoCliente = enderecoCliente;
        this.agencia = NumeroAleatorio.gerarNumeroAleatorio(2);
        this.conta = NumeroAleatorio.gerarNumeroAleatorio(6);
        this.saldo = 0;
    }

    public void sacar(double valor){
        if (Verifica.temSaldo(saldo,valor)){
            saldo = saldo - valor;
        }else{
            System.out.println("Você não possui saldo o suficiente para realizar essa operação!");
        };
    };

    public void transferir(Banco banco, Conta contaDestino, double valor){
        if(Verifica.temConta(contaDestino, banco)){
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
        }else {
            System.out.println("Informações inválidas, essa conta não existe nesse banco!");
        }

    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void mostrarInformacoes(){
        System.out.println("cliente: " + this.getPessoa().getNome());
        System.out.println("Banco: " + this.getBanco().getNome());
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println("Número da Conta: " + this.getConta());
        System.out.println("Saldo: " + this.getSaldo());
    }


    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public String getSaldo() {
        NumberFormat formatoReal = FormatacaoLocalizacao.determinar();
        return formatoReal.format(saldo);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Banco getBanco() {
        return banco;
    }

    public Endereco getEnderecoCliente() {
        return enderecoCliente;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", conta=" + conta +
                ", saldo=" + saldo +
                ", pessoa=" + pessoa.getNome() +
                ", banco=" + banco.getNome() +
                ", enderecoCliente=" + enderecoCliente.toString() +
                ", tipoConta=" + tipoConta +
                '}';
    }
}

