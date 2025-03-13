/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import ListLivros.Catalogo;
import ListOrdenacao.OrdenacaoPessoa;
import ListTarefas.ListaTarefa;

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
        System.out.println("\n");

        Catalogo catalogo = new Catalogo();
        catalogo.adicionarLivro("Livro 1", "Autor 1", 2021);
        catalogo.adicionarLivro("Livro 1", "Autor 2", 2022);
        catalogo.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogo.adicionarLivro("Livro 4", "Autor 4", 2024);

        System.out.println(catalogo.pesquisarPorAutor("Autor 1"));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2021, 2023));
        System.out.println(catalogo.pesquisarPorTitulo("Livro 1"));
        System.out.println("\n");

        OrdenacaoPessoa pessoas = new OrdenacaoPessoa();
        pessoas.adicionarPessoa("Nome 1", 20, 1.54);
        pessoas.adicionarPessoa("Nome 2", 30, 1.80);
        pessoas.adicionarPessoa("Nome 3", 25, 1.71);
        pessoas.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println(pessoas.getLista());
        System.out.println(pessoas.ordenarPorIdade());
        System.out.println(pessoas.ordenarPorAltura());

    }

}
