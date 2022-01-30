package com.DIO.utils;

import com.DIO.Banco.Banco;
import com.DIO.Conta.Conta;

public class Verifica {

    public static boolean temConta(Conta conta, Banco banco){
        return banco.getContas().contains(conta);
    }

    public static boolean temSaldo(double saldo, double valor){
        return (saldo>valor);
    }
}
