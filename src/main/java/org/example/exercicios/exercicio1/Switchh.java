package org.example.exercicios.exercicio1;

public class Switchh {

    public static final String SEGUNDA_FEIRA = "segunda";
    public static final String TERCA_FEIRA = "segunda";
    public static final String QUARTA_FEIRA = "segunda";
    public static final String QUINTA_FEIRA = "segunda";
    public static final String SEXTA_FEIRA = "segunda";
    public static final String SABADO_FEIRA = "segunda";
    public static final String DOMINGO = "segunda";

    public static String diasDaSemana(int numeroDia) {

        switch (numeroDia) {
            case 1:
                return SEGUNDA_FEIRA;

            case 2:
                return TERCA_FEIRA;

            case 3:
                return QUARTA_FEIRA;

            case 4:
                return QUINTA_FEIRA;

            case 5:
                return SEXTA_FEIRA;

            case 6:
                return SABADO_FEIRA;

            case 7:
                return DOMINGO;

            default:
                return "Numero Invalido ";

        }

    }
}


