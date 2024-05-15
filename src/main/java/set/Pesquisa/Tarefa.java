package main.java.set.Pesquisa;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private Boolean conluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.conluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getConluida() {
        return conluida;
    }

    public void setConluida(Boolean conluida) {
        this.conluida = conluida;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", conluida=" + conluida +
                '}';
    }
}
