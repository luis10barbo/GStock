package estoqueswing.controller.abas;

import estoqueswing.model.produto.Produto;
import estoqueswing.dao.produto.ProdutoDAO;
import estoqueswing.view.swing.JanelaPrincipal;
import estoqueswing.view.swing.aba.estoque.AbaEstoque;
import estoqueswing.view.swing.aba.ordem.AbaCriarOrdem;

public class ControllerAbaEstoque {
    AbaEstoque abaEstoque;
    public ControllerAbaEstoque(AbaEstoque abaEstoque) {
        this.abaEstoque = abaEstoque;
    }

    public void cliqueApagarProduto(Produto produto) {
        // TODO: funcionalidade clique apagar produto
        ProdutoDAO.removerProduto(produto);
        abaEstoque.atualizarProdutosPagina();

    }
    public void cliqueEditarProduto(Produto produto) {
        // TODO: funcionalidade clique editar produto
        System.out.println("Editar produto " + produto);
        abaEstoque.atualizarProdutosPagina();
    }

    public void cliquePesquisar(String pesquisa) {
        // TODO: funcionalidade clique botao pesquisar
//        System.out.println("Pesquisando " + pesquisa);
//        ProdutoDAO.adquirirProdutos(pesquisa);
          abaEstoque.atualizarProdutosPagina();
    }

    public void cliqueBotaoCriarOrdem() {
        // TODO: funcionalidade clique botao criar produto
        JanelaPrincipal.adquirir().trocarAba(new AbaCriarOrdem(), false);
    }
}
