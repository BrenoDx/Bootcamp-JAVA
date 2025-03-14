/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SetProdutos;

import java.util.Comparator;

/**
 *
 * @author breno
 */
public class Produto implements Comparable<Produto>{
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, long codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        return this.codigo == other.codigo;
    }

    
    
    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", codigo=" + codigo + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
}

class ComparatorPorPreco implements Comparator<Produto>{
    
    @Override
    public int compare(Produto p1, Produto p2){
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
