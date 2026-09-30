package Controller;

import Model.*;
import Util.Leitor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefa{

    private static List<Tarefa> tarefas = new ArrayList<>();

    public static void criarTarefa(int id, String titulo, String descricao, Materia materia, LocalDate data) {
        Tarefa tarefa = new Tarefa(id, titulo, descricao, materia, data);
        tarefas.add(tarefa);
    }


    public static void criarTarefa(String titulo, String descricao, Materia materia, LocalDate data) {
        Tarefa tarefa = new Tarefa(titulo, descricao, materia, data);
        tarefas.add(tarefa);
    }

    public static void editarTarefa(int id, String titulo, String descricao, Materia materia, LocalDate data) {
            for(Tarefa tarefa : tarefas) {
                if(tarefa.getId() == id) {
                    tarefa.setTitulo(titulo);
                    tarefa.setDescricao(descricao);
                    tarefa.setMateria(materia);
                    tarefa.setDataEntrega(data);
                }
            }
    }

    public void excluirTarefa(int id) {
        for (int i = 0; i < this.tarefas.size(); i++) {
            if (tarefas.get(i).getId() == id){
                tarefas.remove(i);
            }
        }
    }


    public void listarTarefa(int id) {
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getId() == id) {
                System.out.println(tarefa);
            }
        }
    }


    public void listarTarefa(LocalDate date) {

    }

    public void listarTarefa(Materia materia) {

    }

    public static void  processarEscolha(int escolha){
        switch(escolha){
            case 0:
                System.exit(0);
                break;
            case 1:
                var titulo = Leitor.lerString("Insira o titulo: ");

                var descricao = Leitor.lerString("Insira a descricao: ");

                var materia = Leitor.lerString("Insira a materia: ");

                var data = Leitor.lerData("Insira a data:");

                criarTarefa(titulo, descricao, new Materia(materia), data);
                break;
            case 2:
                var id = Leitor.lerInt("insira o id: ");

                titulo = Leitor.lerString("Insira o titulo: ");

                descricao = Leitor.lerString("Insira a descricao: ");

                materia = Leitor.lerString("Insira a materia: ");

                data = Leitor.lerData("Insira a data: ");

                editarTarefa(id, titulo, descricao, materia, data);
                break;
            case 3:

                break;
            case 4:

                break;
            default:
        }
    }

}
