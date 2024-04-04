package org.example.exercicios.exercicio1;

import javax.swing.*;

public class Forwhiledowhile {

    public static void imprimirLoop(int numero){
        String texto = "";

        for (int i = 0; i < numero; i++) {
            texto = texto + "For: " + i + "\n";
        }
        JOptionPane.showMessageDialog(null,texto);

        int aux = 0;
        while (aux < numero){
            aux++;
            texto = texto + "While: " + aux + "\n";
        }
        JOptionPane.showMessageDialog(null,texto);

        int aux1 = 0;
        do {
            aux1++;
            texto = texto + "Do While: " + aux1 + "\n";

        }while (aux1 < numero);
        JOptionPane.showMessageDialog(null,texto);




    }




}
