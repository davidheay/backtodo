package com.backtoDo.BackToDo.Model;

public class ToDo {

    private Integer indice;
    private String texto;
    private Integer estado;

    public ToDo(Integer indice, String texto, Integer estado) {
        this.indice = indice;
        this.texto = texto;
        this.estado = estado;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }
}