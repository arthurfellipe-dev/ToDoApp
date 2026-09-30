package Model;

public enum Status {
    PENDENTE("pendente"),
    CONCLUIDA("concluida");

    private String descricao;

    Status(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
