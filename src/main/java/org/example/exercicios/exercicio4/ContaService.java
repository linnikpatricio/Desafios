package org.example.exercicios.exercicio4;

public class ContaService {

    public void depositar(Conta conta, double quantia){
        double saltoAtual = conta.getSaldo();
        double quantiaAtualizada = saltoAtual += quantia;
        conta.setSaldo(quantiaAtualizada);
    }
    public void saque(Conta conta, double quantia){
        double saldoAtual = conta.getSaldo();
        double quantiaAtualizada = saldoAtual -= quantia + 5;
        conta.setSaldo(quantiaAtualizada);

    }


}
