package com.backtoDo.BackToDo.Controllers;

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
    public String getData() {
        return persistencia.getToDos().toString();
    }

    @PostMapping("")
    public String addToDo(@RequestParam String texto) {
        persistencia.add(texto);
        return persistencia.getToDos().toString();
    }

    @DeleteMapping("")
    public String borrar(@RequestParam String texto) {
        persistencia.borrar(texto);
        return persistencia.getToDos().toString();
    }

    @PutMapping("")
    public String actualizar(@RequestParam String texto, @RequestParam Integer estado) {
        persistencia.actualizar(texto, estado);
        return persistencia.getToDos().toString();
    }

}