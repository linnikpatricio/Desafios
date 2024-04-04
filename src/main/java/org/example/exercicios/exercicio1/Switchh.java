package org.example.exercicios.exercicio1;

import javax.swing.*;

public class Switchh {

    public static final int SEGUNDA_FEIRA = 1;
    public static final int TERCA_FEIRA = 2;
    public static final int QUARTA_FEIRA = 3;
    public static final int QUINTA_FEIRA = 4;
    public static final int SEXTA_FEIRA = 5;
    public static final int SABADO_FEIRA = 6;
    public static final int DOMINGO = 7;

    public static String diasDaSemana(int numeroDia) {

        switch (numeroDia) {
            case SEGUNDA_FEIRA:
                JOptionPane.showMessageDialog(null, "segunda");
                break;

            case TERCA_FEIRA:
                JOptionPane.showMessageDialog(null, "terça feira");
                break;

            case QUARTA_FEIRA:
                JOptionPane.showMessageDialog(null, "quarta feira");
                break;

            case QUINTA_FEIRA:
                JOptionPane.showMessageDialog(null, "quinta feira");
                break;

            case SEXTA_FEIRA:
                JOptionPane.showMessageDialog(null, "sexta feira");
                break;

            case SABADO_FEIRA:
                JOptionPane.showMessageDialog(null, "sabado");
                break;

            case DOMINGO:
                JOptionPane.showMessageDialog(null, "domingo");
                break;

            default:
                return "Numero Invalido... ";

        }
        return null;

    }
}


