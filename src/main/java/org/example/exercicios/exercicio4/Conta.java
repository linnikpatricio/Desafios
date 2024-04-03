package org.example.exercicios.exercicio4;

public class Conta {
    private int numero;

    private String nomeTitular;

    private double saldo;

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumero() {
        return numero;
    }

    public Conta(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Conta (){}

    public Conta (int numero,String nomeTitular, double saldo){
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;

    }


    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", nomeTitular='" + nomeTitular + '\'' +
                ", saldo= " + saldo +
                '}';
    }
}

