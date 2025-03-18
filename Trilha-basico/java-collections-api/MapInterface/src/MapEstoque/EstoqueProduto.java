/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MapEstoque;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author breno
 */
public class EstoqueProduto {

    private Map<Long, Produto> mapEstoque;

    public EstoqueProduto() {
        this.mapEstoque = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, double valor, int quantidade) {
        mapEstoque.put(cod, new Produto(nome, valor, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(mapEstoque);
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0;
        if (!mapEstoque.isEmpty()) {
            for (Produto p : mapEstoque.values()) {
                valorTotal += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto pMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!mapEstoque.isEmpty()) {
            for (Produto p : mapEstoque.values()) {
                if (p.getPreco() > maiorPreco) {
                    pMaisCaro = p;
                }
            }
        }
        return pMaisCaro;
    }
}
