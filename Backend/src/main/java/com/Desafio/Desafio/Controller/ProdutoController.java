package com.Desafio.Desafio.Controller;

import com.Desafio.Desafio.Model.Produto;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@Transactional
public class ProdutoController {
    @GetMapping("/cardapio")
    public List<Produto> listaProdutos() {
        Produto produto = new Produto();
        produto.setId(1);
        produto.setCategoria("Sanduíches");
        produto.setDescricao("Produto fake, busque os dados do banco");
        produto.setPreco(20.0);
        return Collections.singletonList(produto);
    }

}
