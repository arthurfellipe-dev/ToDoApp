package Model;

import java.util.Objects;

public class Materia {
    private int id;
    private String nome;

    public Materia(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Materia(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Materia)) return false;
        Materia materia = (Materia) o;
        return nome != null && nome.equalsIgnoreCase(materia.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome == null ? null : nome.toLowerCase());
    }

    @Override
    public String toString() {
        return nome;
    }
}
