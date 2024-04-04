package org.example.exercicios.exercicio1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


//      METODO PRA DIZER SE O NUMERO É POSITIVO OU NEGATIVO

        String numero1 = JOptionPane.showInputDialog(null,"Insira um número: ");
        int numero2 = Integer.parseInt(numero1);
        MetodojoptionPane.metodoNumeroPN(numero2);


//      METODO PRA INSERIR UM NUMERO E APARECER UM DIA DA SEMANA

        String numero3 = JOptionPane.showInputDialog(null,"Insira um número: ");
        int numero4 = Integer.parseInt(numero3);
        Switchh.diasDaSemana(numero4);

//      METODO DE IMPRIMIR LOOP

        String numero5 = JOptionPane.showInputDialog(null,"Insira um numero: ");
        int numero6 = Integer.parseInt(numero5);
        Forwhiledowhile.imprimirLoop(numero6);

    }
}