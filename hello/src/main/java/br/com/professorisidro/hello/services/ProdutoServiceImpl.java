package br.com.professorisidro.hello.services;

import br.com.professorisidro.hello.model.Produto;

public class ProdutoServiceImpl implements IProdutoService {

    @Override
    public Produto aplicarDesconto(Produto prod, double percentual) {
        double novoPreco = prod.getPreco() - prod.getPreco() * percentual / 100;
        prod.setPreco(novoPreco);
        return prod;
    }
}
