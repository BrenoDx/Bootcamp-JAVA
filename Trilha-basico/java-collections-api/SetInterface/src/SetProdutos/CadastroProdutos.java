/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SetProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author breno
 */
public class CadastroProdutos {
    private Set<Produto> setProduto;

    public CadastroProdutos() {
        this.setProduto = new HashSet<>();
    }
    
    public void adicionarProduto(long cod, String nome, double valor, int quantidade){
        setProduto.add(new Produto(nome, cod, valor, quantidade));
    }
    
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(setProduto);
        return produtosPorNome;
    }
    
    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(setProduto);
        return produtosPorPreco;
    }

    public Set<Produto> getSetProduto() {
        return setProduto;
    }
    
}
