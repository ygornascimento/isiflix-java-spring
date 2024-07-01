package br.com.professorisidro.hello.services;

import br.com.professorisidro.hello.model.Produto;

public interface IProdutoService {

    public Produto aplicarDesconto(Produto prod, double percentual);
}
