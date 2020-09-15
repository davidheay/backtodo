package com.backtoDo.BackToDo.Controllers;

import java.util.List;

import com.backtoDo.BackToDo.Model.ToDo;
import com.backtoDo.BackToDo.Persistencia.Persistencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
public class IndexController {

    @Autowired
    private Persistencia persistencia;

    @GetMapping("")
    public List<ToDo> getData() {
        return persistencia.getToDos();
    }

    @PostMapping("")
    public List<ToDo> addToDo(@RequestParam String texto) {
        persistencia.add(texto);
        return persistencia.getToDos();
    }

    @DeleteMapping("")
    public List<ToDo> borrar(@RequestParam String texto) {
        persistencia.borrar(texto);
        return persistencia.getToDos();
    }

    @PutMapping("")
    public List<ToDo> actualizar(@RequestParam Integer indice, @RequestParam Integer estado) {
        persistencia.actualizar(indice, estado);
        return persistencia.getToDos();
    }

}