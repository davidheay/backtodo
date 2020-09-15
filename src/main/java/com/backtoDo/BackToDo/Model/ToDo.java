package com.backtoDo.BackToDo.Model;

public class ToDo {

    private String texto;
    private Integer estado;

    public ToDo(String texto, Integer estado) {
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

    @Override
    public String toString() {
        return "ToDo [estado=" + estado + ", texto=" + texto + "]";
    }
}