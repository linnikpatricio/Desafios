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
        if(!listaTarefas.contains(tarefa)) {
            listaTarefas.add(tarefa);

        }else {
            JOptionPane.showMessageDialog(null,"A palavra '" + tarefa + "' já está na lista e não será adicionada novamente.");
        }


    }

    //    METODO PRA LISTAR TODAS AS TAREFAS
    public void visualizarTarefas() {
        String texto = "";
        JOptionPane.showMessageDialog(null, " === Lista de Tarefas === ");
        for (Tarefa tarefa : listaTarefas) {
            texto = texto + "\n"+tarefa.getNome();
        }
        JOptionPane.showMessageDialog(null,texto);


    }

//    METODO PRA REMOVER UMA TAREFA
    public void removerTarefas(String nome){
        Tarefa tarefaRemover = null;
        for (Tarefa tarefas : listaTarefas) {
            if (tarefas.getNome().equals(nome)) {
                tarefaRemover = tarefas;
                break;

            }
        }
        if(tarefaRemover != null){
            listaTarefas.remove(tarefaRemover);
            JOptionPane.showMessageDialog(null,"Tarefas removida: "+tarefaRemover);


        } else {
            JOptionPane.showMessageDialog(null,"Tarefa não encontrada");
        }



    }


}