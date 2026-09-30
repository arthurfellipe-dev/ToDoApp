package Model;

import java.time.LocalDate;

public class Tarefa {
    private int id;
    private String titulo;
    private String descricao;
    private Materia materia;
    private Status status;
    private LocalDate dataEntrega;

    public Tarefa(int id, String titulo, String descricao, Materia materia, LocalDate dataEntrega) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.materia = materia;
        this.dataEntrega = dataEntrega;
        setStatus(Status.PENDENTE);
    }

    public Tarefa(String titulo, String descricao, Materia materia, LocalDate dataEntrega) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.materia = materia;
        this.dataEntrega = dataEntrega;
        setStatus(Status.PENDENTE);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    @Override
    public String toString() {
        return
            "id: " + id +
            "\ntitulo: '" + titulo + '\'' +
            "\ndescricao: '" + descricao + '\'' +
            "\nmateria: " + materia +
            "\nstatus: " + status +
            "\ndata de entrega: " + dataEntrega;
    }
}
