package org.example.exercicios.exercicio4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ContaService contaService = new ContaService();


        String numeroConta = JOptionPane.showInputDialog(null,"digite o numero da conta: ");
        int numero = Integer.parseInt(numeroConta);
        Conta conta = new Conta(numero);

        String nome = JOptionPane.showInputDialog(null,"digite o titular da conta: ");
        conta.setNomeTitular(nome);

        String [] opcoes = {"Sim","Não"};

        int resposta = JOptionPane.showOptionDialog(null,"Existe um valor inicial(s/n)? ",
                "valor inicial",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcoes,opcoes[0]);

        if (resposta == JOptionPane.YES_OPTION){
            String valorInicial = JOptionPane.showInputDialog(null,"Digite seu valor inicial: ");
            double valor = Double.parseDouble(valorInicial);
            conta.setSaldo(valor);
        }
        JOptionPane.showMessageDialog(null,conta);

        String deposito = JOptionPane.showInputDialog(null,"Insira um valor de deposito: ");
        double deposito1 = Double.parseDouble(deposito);
        contaService.depositar(conta,deposito1);


        JOptionPane.showMessageDialog(null,conta);

        String saque = JOptionPane.showInputDialog(null,"Insira um valor de saque:");
        double saque1 = Double.parseDouble(saque);
        contaService.saque(conta,saque1);

        JOptionPane.showMessageDialog(null,conta);


    }
}