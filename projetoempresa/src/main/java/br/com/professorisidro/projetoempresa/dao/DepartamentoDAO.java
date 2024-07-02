package br.com.professorisidro.projetoempresa.dao;

import br.com.professorisidro.projetoempresa.model.Departamento;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface DepartamentoDAO extends CrudRepository<Departamento, Integer> {
    public List<Departamento> findByOrderByNome();
    public List<Departamento> findByAndar(int andar);
}
