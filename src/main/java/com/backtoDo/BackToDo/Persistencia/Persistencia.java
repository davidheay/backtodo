package com.backtoDo.BackToDo.Persistencia;

import java.util.ArrayList;
import java.util.List;

import com.backtoDo.BackToDo.Model.ToDo;

import org.springframework.stereotype.Component;

@Component
public class Persistencia {

    private List<ToDo> todos;

    public Persistencia() {
        this.todos = new ArrayList<>();
    }

    public List<ToDo> getToDos() {
        List<ToDo> temp = new ArrayList<>();
        for (ToDo toDo : todos)
            if (toDo.getEstado() != 2)
                temp.add(toDo);
        return temp;
    }

    public void add(String text) {
        this.todos.add(new ToDo(this.todos.size(), text, 0));
    }

    public void actualizar(Integer indice, Integer estado) {
        todos.get(indice).setEstado(estado);
    }

    public void borrar(String text) {
        for (ToDo toDo : todos)
            if (toDo.getTexto().equals(text))
                toDo.setEstado(2);
    }

    @Override
    public String toString() {
        return "Persistencia [todos=" + todos + "]";
    }

}
