package org.example.exercicios.exercicio2;

import javax.swing.*;
import java.util.ArrayList;

public class ServicoTarefa {

    private ArrayList<Tarefa> listaTarefas;

    public ServicoTarefa() {
        listaTarefas = new ArrayList<>();
    }

    //  METODO PRA ADICIONAR TAREFAS
    public void adicionarTarefa(Tarefa tarefa) {
        boolean existeNomeTarefa = adicionarTarefaSemRepeticao(tarefa.getNome());

        while (existeNomeTarefa) {
            String novaTarefa = JOptionPane.showInputDialog(null, "Essa tarefa já existe, por favor digite uma nova tarefa!");
            existeNomeTarefa = adicionarTarefaSemRepeticao(novaTarefa);
        }

        listaTarefas.add(tarefa);
        JOptionPane.showMessageDialog(null, "Tarefa Adicionada");
    }

    public boolean adicionarTarefaSemRepeticao(String nome) {
        for (int i = 0; i < listaTarefas.size(); i++) {
            if (listaTarefas.get(i).getNome().equalsIgnoreCase(nome)) {
                return true;

            }
        }
        return false;
    }

    //    METODO PRA LISTAR TODAS AS TAREFAS
    public void visualizarTarefas() {
        String texto = "";
        JOptionPane.showMessageDialog(null, " === Lista de Tarefas === ");
        for (Tarefa tarefa : listaTarefas) {
            texto = texto + "\n" + tarefa.getNome();
        }
        JOptionPane.showMessageDialog(null, texto);


    }

    //    METODO PRA REMOVER UMA TAREFA
    public void removerTarefas(String nome) {
        Tarefa tarefaRemover = null;
        for (Tarefa tarefas : listaTarefas) {
            if (tarefas.getNome().equals(nome)) {
                tarefaRemover = tarefas;
                break;

            }
        }
        if (tarefaRemover != null) {
            listaTarefas.remove(tarefaRemover);
            JOptionPane.showMessageDialog(null, "Tarefa removida: " + tarefaRemover);


        } else {
            JOptionPane.showMessageDialog(null, "Tarefa não encontrada");
        }


    }


}