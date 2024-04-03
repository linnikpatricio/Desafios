package org.example.exercicios.exercicio1;

public class MetodojoptionPane {

    public static void metodoNumeroPN(int numero){
        if(numero < 0){
            javax.swing.JOptionPane.showMessageDialog(null,"Número Negativo! ");

        } else if (numero > 0) {
            javax.swing.JOptionPane.showMessageDialog(null,"Número Positivo! ");
        } else {
            javax.swing.JOptionPane.showMessageDialog(null,"Número Neutro! ");
        }
    }
}
