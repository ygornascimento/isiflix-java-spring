package br.com.professorisidro.hello.controller;

import br.com.professorisidro.hello.model.Produto;
import br.com.professorisidro.hello.services.IProdutoService;
import br.com.professorisidro.hello.services.ProdutoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {
    @Autowired
    IProdutoService ips;

    @GetMapping("/produto")
    public Produto recuperarProduto() {
        Produto prod;
        prod = new Produto();
        prod.setId(12345);
        prod.setDescricao("Computador top de linha");
        prod.setPreco(2500.00);
        prod = ips.aplicarDesconto(prod, 10);

        return prod;
    }

    @PostMapping("/novoproduto")
    public String cadastrarNovoProduto(@RequestBody Produto prod) {
        System.out.println("Recebido: " + prod.getId()+"/"+prod.getDescricao()+"/"+prod.getPreco());

        return "Produto cadastrado com sucesso!";
    }
}
