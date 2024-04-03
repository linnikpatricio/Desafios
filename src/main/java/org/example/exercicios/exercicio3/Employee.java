package org.example.exercicios.exercicio3;

public class Employee {

    public String nome;
    private double salarioBruto;
    private double taxa;

    public Employee(String nome, double salarioBruto, double taxa){
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.taxa = taxa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    public Employee (){}

    @Override
    public String toString() {
        return "Employee{" +
                "nome='" + nome + '\'' +
                ", salarioBruto=" + salarioBruto +
                ", taxa=" + taxa +
                '}';
    }
}
