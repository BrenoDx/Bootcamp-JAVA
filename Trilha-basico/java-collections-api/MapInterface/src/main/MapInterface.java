/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import MapContato.AgendaContatos;
import MapEstoque.EstoqueProduto;
import MapEventos.AgendaEventos;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author breno
 */
public class MapInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        
        agenda.adicionarContato("Camila", 123456);
        agenda.adicionarContato("Camila", 5665);
        agenda.adicionarContato("Camila Calvacante", 111111);
        agenda.adicionarContato("Camila Dio", 654987);
        agenda.adicionarContato("Maria Silva", 111111);
        agenda.adicionarContato("Camila", 44444);
        
        
        agenda.exibirContato();
        agenda.removerContato("Maria Silva");
        agenda.exibirContato();
        System.out.println("O numero é: " + agenda.pesquisarPorNome("Camila Dio"));
        
        
        EstoqueProduto estoque = new EstoqueProduto();
        estoque.exibirProdutos();
        
        estoque.adicionarProduto(1l, "Produto A", 5.0, 10);
        estoque.adicionarProduto(2l, "Produto B", 10.0, 5);
        estoque.adicionarProduto(3l, "Produto A", 15.0, 2);
        
        estoque.exibirProdutos();
        
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais Caro: " + estoque.obterProdutoMaisCaro());
        
        AgendaEventos evento = new AgendaEventos();
        evento.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atracao 1");
        evento.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atracao 2");
        evento.adicionarEvento(LocalDate.of(2025, Month.JULY, 02), "Evento 3", "Atracao 3");
        
        evento.exibirAgenda();
        evento.obterProximoEvento();
    }
    
}
