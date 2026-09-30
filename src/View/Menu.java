package View;

import Controller.GerenciadorTarefa;
import Util.Leitor;

public class Menu {

    public void showMainMenu(){

         GerenciadorTarefa.processarEscolha(Leitor.lerInt("""
                 0-Sair
                 1-Criar tarefa
                 2-Editar tarefa
                 3-Deletar tarefa
                 4-Filtrar tarefa
                 """));
     }
}
