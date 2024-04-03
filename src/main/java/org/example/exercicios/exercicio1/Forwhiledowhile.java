package org.example.exercicios.exercicio1;

import javax.swing.*;

public class Forwhiledowhile {

    public static void imprimirLoop(int numero){

        for (int i = 0; i < numero; i++) {
            JOptionPane.showMessageDialog(null,"For " + i);

        }
        int aux = 0;
        while (aux < numero){
            JOptionPane.showMessageDialog(null,"While " + aux);
            aux++;
        }
        int aux1 = 0;
        do {
            JOptionPane.showMessageDialog(null,"Do While" + aux1);
            aux1++;
        }while (aux1 < numero);



    }




}
