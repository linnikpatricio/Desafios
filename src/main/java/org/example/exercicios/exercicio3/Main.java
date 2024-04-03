package org.example.exercicios.exercicio3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();

        String nome = JOptionPane.showInputDialog(null,"Insira seu nome: ");
        employee.setNome(nome);

        String salario = JOptionPane.showInputDialog(null,"Insira seu salário: ");
        double salario1 = Double.parseDouble(salario);
        employee.setSalarioBruto(salario1);

        String taxa = JOptionPane.showInputDialog(null,"Insira a taxa: ");
        double taxa1 = Double.parseDouble(taxa);
        employee.setTaxa(taxa1);
        double salarioLiquido = Servico.obterSalarioLiquido(employee);

        JOptionPane.showMessageDialog(null,"Nome do Funcionário: "+ employee.getNome()+"\nSalario Bruto: "+
                employee.getSalarioBruto()+"\nSalario liquido: "+salarioLiquido);





//      SEGUNDO FUNCIONARIO !!!

        Employee employee1 = new Employee();

        String nome1 = JOptionPane.showInputDialog(null,"Insira seu nome: ");
        employee1.setNome(nome1);

        String salario2 = JOptionPane.showInputDialog(null,"Insira seu salário: ");
        double salario3 = Double.parseDouble(salario2);
        employee1.setSalarioBruto(salario3);

        String taxa2 = JOptionPane.showInputDialog(null,"Insira a taxa: ");
        double taxa3 = Double.parseDouble(taxa2);
        employee1.setTaxa(taxa3);
        double salarioLiquido1 = Servico.obterSalarioLiquido(employee1);

        JOptionPane.showMessageDialog(null,"Nome do Funcionário: "+ employee1.getNome()+"\nSalario Bruto: "+
                employee1.getSalarioBruto()+"\nSalario liquido: "+salarioLiquido1);

        double aumentarSalario = Servico.aumentoSalario(employee1);

        JOptionPane.showMessageDialog(null,"Nome do Funcionário: "+ employee1.getNome()+"\nSalario Bruto: "+
                employee1.getSalarioBruto()+"\nSalario liquido: "+salarioLiquido1+"\nSalario aumentado: "+aumentarSalario);

        JOptionPane.showMessageDialog(null,"Salario liquido - Primeiro funcionario: "+salarioLiquido+"\nSalario liquido - Segundo funcionario: "+aumentarSalario);




    }
}