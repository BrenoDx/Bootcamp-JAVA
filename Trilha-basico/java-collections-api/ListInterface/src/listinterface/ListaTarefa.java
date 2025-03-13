/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listinterface;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author breno
 */
public class ListaTarefa {
    private List<Tarefa> lista; // Atributo
    
    public ListaTarefa(){
        this.lista = new ArrayList<>();
    }
    
    public void adicionarTarefa(String descricao){
        lista.add(new Tarefa(descricao));
    }
    
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : lista){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        lista.removeAll(tarefasParaRemover);
    }
    
    public int totalDeTarefas(){
            return lista.size();
        }
    
    public void descricoesTarefas(){
        System.out.println(lista);
    }
}
