package com.DIO;

import com.DIO.Banco.Banco;
import com.DIO.Conta.Conta;
import com.DIO.Conta.ContaCorrente;
import com.DIO.Conta.ContaPoupanca;
import com.DIO.Endereco.Endereco;
import com.DIO.Enums.BancosDisponiveis;
import com.DIO.Pessoa.Pessoa;


public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco(BancosDisponiveis.BANCO1);
        Banco banco2 = new Banco(BancosDisponiveis.BANCO2);
        Banco banco3 = new Banco(BancosDisponiveis.BANCO3);

        Pessoa cliente = new Pessoa("Rodrigo","0121211");
        Endereco enderecoCliente = new Endereco("rua 1",1,"bairo 1","Cidade 1",
                "estado 1", "1111111");
        Conta cc = new ContaCorrente(cliente,banco,enderecoCliente);
        cc.mostrarInformacoes();
        banco.adicionarConta(cc);

        Pessoa cliente2 = new Pessoa("Pedro","3434445");
        Endereco enderecoCliente2 = new Endereco("rua 2",2,"bairo 2","Cidade 2",
                "estado 2", "2222222");
        Conta cc2 = new ContaCorrente(cliente2,banco,enderecoCliente2);
        cc2.mostrarInformacoes();
        banco.adicionarConta(cc2);

        Pessoa cliente3 = new Pessoa("Maria","4444455");
        Endereco enderecoCliente3 = new Endereco("rua 3",3,"bairo 3","Cidade 3",
                "estado 3", "33333333");
        Conta cc3 = new ContaCorrente(cliente3,banco2,enderecoCliente3);
        cc3.mostrarInformacoes();
        banco2.adicionarConta(cc3);

        Conta cp = new ContaPoupanca(cliente3,banco2,enderecoCliente3);
        cp.mostrarInformacoes();
        banco2.adicionarConta(cp);
        banco2.adicionarConta(cp);  // Operação inválida

        Pessoa cliente4 = new Pessoa("Roberta","4890455");
        Endereco enderecoCliente4 = new Endereco("rua 3",3,"bairo 3","Cidade 3",
                "estado 3", "33333333");
        Conta cp2 = new ContaPoupanca(cliente4,banco3,enderecoCliente4);
        cp2.mostrarInformacoes();
        banco3.adicionarConta(cp2);

        System.out.println("\n------ Lista de Contas ------");
        System.out.println(banco.getNome() + ": " + banco.getContas());
        System.out.println(banco2.getNome() + ": " + banco2.getContas());
        System.out.println(banco3.getNome() + ": " + banco3.getContas());

        System.out.println("\n------ Operações ------");

        System.out.println("-> Utilizando o método Depositar: ");
        System.out.println("Saldo Conta " + cc.getTipoConta() + " Número: " + cc.getConta() + " do titular "
                + cc.getPessoa().getNome() +": " + cc.getSaldo());
        cc.depositar(500);
        System.out.println("Saldo Conta " + cc.getTipoConta() + " Número: " + cc.getConta() + " do titular "
                + cc.getPessoa().getNome() +": " + cc.getSaldo());

        System.out.println("\n-> Utilizando o método Sacar: ");
        cc.sacar(700);
        System.out.println("Saldo Conta " + cc.getTipoConta() + " Número: " + cc.getConta() + " do titular "
                + cc.getPessoa().getNome() +": " + cc.getSaldo());
        cc.sacar(200);
        System.out.println("Saldo Conta " + cc.getTipoConta() + " Número: " + cc.getConta() + " do titular "
                + cc.getPessoa().getNome() +": " + cc.getSaldo());

        System.out.println("\n-> Utilizando o método Transferir: ");
        cc.transferir(banco,cc2,100);
        cc.transferir(banco2,cc2,100);  // Operação inválida
        cc.transferir(banco2,cc3,100);
        cc3.transferir(banco2,cp,70);
        cp.transferir(banco2,cp2,90); // Operação inválida
        cp.transferir(banco3,cp2,20);
        System.out.println("Saldo Conta " + cc.getTipoConta() + " Número: " + cc.getConta() + " do titular "
                + cc.getPessoa().getNome() +": " + cc.getSaldo());
        System.out.println("Saldo Conta " + cc2.getTipoConta() + " Número: " + cc2.getConta() + " do titular "
                + cc2.getPessoa().getNome() +": " + cc2.getSaldo());
        System.out.println("Saldo Conta " + cc3.getTipoConta() + " Número: " + cc3.getConta() + " do titular "
                + cc3.getPessoa().getNome() +": " + cc3.getSaldo());
        System.out.println("Saldo Conta " + cp.getTipoConta() + " Número: " + cp.getConta() + " do titular "
                + cp.getPessoa().getNome() +": " + cp.getSaldo());
        System.out.println("Saldo Conta " + cp2.getTipoConta() + " Número: " + cp2.getConta() + " do titular "
                + cp2.getPessoa().getNome() +": " + cp2.getSaldo());

    }

}
