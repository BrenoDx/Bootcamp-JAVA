/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MapContato;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author breno
 */
public class AgendaContatos {
    private Map<String, Integer> mapAgenda;

    public AgendaContatos() {
        this.mapAgenda = new HashMap<>();
    }
    
    public void adicionarContato(String nome, int telefone){
        mapAgenda.put(nome, telefone);
    }
    
    public void removerContato(String nome){
        if(!mapAgenda.isEmpty()){
            mapAgenda.remove(nome);
        }
    }
    
    public void exibirContato(){
            System.out.println(mapAgenda);
    }
    
    public int pesquisarPorNome(String nome){
        Integer numero = null;
        if(!mapAgenda.isEmpty()){
           numero = mapAgenda.get(nome);
            
        }
        return numero;
    }
}
