package org.example.exercicios.exercicio3;

public class Servico {

    public static double obterSalarioLiquido(Employee employee){
        double salarioLiquido = (employee.getSalarioBruto() / 100) * employee.getTaxa() - employee.getSalarioBruto();
        return Math.abs(salarioLiquido);


    }

    public static double aumentoSalario (Employee employee){
        double aumentarSalario = (employee.getSalarioBruto() / 100) * employee.getTaxa() - employee.getSalarioBruto() * 1.10;
        return Math.abs(aumentarSalario);

    }
}
