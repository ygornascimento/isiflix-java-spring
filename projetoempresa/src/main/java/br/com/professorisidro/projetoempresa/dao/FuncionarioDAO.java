package br.com.professorisidro.projetoempresa.dao;

import br.com.professorisidro.projetoempresa.model.Funcionario;
import org.springframework.data.repository.CrudRepository;

public interface FuncionarioDAO extends CrudRepository<Funcionario, Integer> {

}
