package br.com.professorisidro.projetoempresa.controller;

import br.com.professorisidro.projetoempresa.dao.DepartamentoDAO;
import br.com.professorisidro.projetoempresa.model.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DepartamentoController {
    @Autowired
    private DepartamentoDAO dao;

    @GetMapping("/departamentos")
    public ArrayList<Departamento> recuperarTodos() {
        ArrayList<Departamento> lista;
        lista = (ArrayList<Departamento>)dao.findAll();

        return lista;
    }
}
