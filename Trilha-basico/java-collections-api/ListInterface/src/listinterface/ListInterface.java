/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listinterface;

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
    }
    
}
