/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import SetContatos.AgendaContatos;
import SetConvidado.ConjuntoConvidados;
import SetProdutos.CadastroProdutos;

/**
 *
 * @author breno
 */
public class SetInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConjuntoConvidados conjuConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuConvidados.contarConvidados() + " dentro do Set de Convidados");

        conjuConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuConvidados.adicionarConvidado("Convidado 4", 1236);

        conjuConvidados.exibirConvidados();
        System.out.println("Existem " + conjuConvidados.contarConvidados() + " dentro do Set de Convidados");
        conjuConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + conjuConvidados.contarConvidados() + " dentro do Set de Convidados"); 
        conjuConvidados.exibirConvidados();
        
        AgendaContatos contatos = new AgendaContatos();
        contatos.exibirContatos();
        
        contatos.adicionarContato("Camila", 123456);
        contatos.adicionarContato("Camila", 0);
        contatos.adicionarContato("Camila Cavalcante", 111111);
        contatos.adicionarContato("Camila DIO", 654321);
        contatos.adicionarContato("Maria Silva", 111111);
        
        contatos.exibirContatos();
        System.out.println(contatos.pesquisarPorNome("Maria"));
        
        System.out.println("Contato atualizado: " + contatos.atualizarNumeroContato("Maria Silva", 55555));
        contatos.exibirContatos();
        
        CadastroProdutos produtos = new CadastroProdutos();
        produtos.adicionarProduto(1l, "Produto 5", 15d, 5);
        produtos.adicionarProduto(2l, "Produto 0", 20d, 10);
        produtos.adicionarProduto(1l, "Produto 3", 10d, 2);
        produtos.adicionarProduto(9l, "Produto 9", 2d, 2);
        
        System.out.println(produtos.getSetProduto());
        System.out.println(produtos.exibirProdutosPorNome());
        System.out.println(produtos.exibirPorPreco());
        
    }

}
