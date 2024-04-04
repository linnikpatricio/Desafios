package org.example.exercicios.exercicio2;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ServicoTarefa servicoTarefa = new ServicoTarefa();



        int opcao;
        do {
            JOptionPane.showMessageDialog(null,"Bem-vindo á Lista de Tarefas!");
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n"+
                    "1. Adicionar Tarefa\n" +
                    "2. Visualizar Tarefa\n" +
                    "3. Remover Tarefa\n" +
                    "4. Sair do Programa"));

            if(opcao == 1){
                String novaTarefa = JOptionPane.showInputDialog(null,"Insira sua tarefa ");
                Tarefa tarefa = new Tarefa(novaTarefa);
                servicoTarefa.adicionarTarefa(tarefa);


            }else if (opcao == 2){
                servicoTarefa.visualizarTarefas();


            } else if (opcao == 3) {
                String tarefasRemover = JOptionPane.showInputDialog(null,"Insira a tarefa ");
                servicoTarefa.removerTarefas(tarefasRemover);


            } else if (opcao == 4) {
                JOptionPane.showMessageDialog(null,"Saindo Do Programa... ");

            }else {
                JOptionPane.showMessageDialog(null,"Opção inválida!, Por favor insira outra opção ");
            }

        } while (opcao != 4);
    }
}
