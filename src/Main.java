import Controller.GerenciadorTarefa;
import Model.Materia;

void main() {
    GerenciadorTarefa gt = new GerenciadorTarefa();
    gt.criarTarefa(1, "cu", "eai", new Materia("pinto", new Professor(1, "albert")));
    gt.listarTarefa(1);
}
