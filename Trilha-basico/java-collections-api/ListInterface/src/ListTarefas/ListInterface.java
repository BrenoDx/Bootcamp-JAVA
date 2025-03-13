/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ListTarefas;

import ListLivros.Catalogo;

/**
 *
 * @author breno
 */
public class ListInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println(listaTarefa.totalDeTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println(listaTarefa.totalDeTarefas());

        listaTarefa.descricoesTarefas();
        
        Catalogo catalogo = new Catalogo();
        catalogo.adicionarLivro("Livro 1", "Autor 1", 2021);
        catalogo.adicionarLivro("Livro 1", "Autor 2", 2022);
        catalogo.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogo.adicionarLivro("Livro 4", "Autor 4", 2024);

        System.out.println(catalogo.pesquisarPorAutor("Autor 1"));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2021, 2023));
        System.out.println(catalogo.pesquisarPorTitulo("Livro 1"));
    }

}
