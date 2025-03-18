/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MapEventos;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author breno
 */
public class AgendaEventos {
    private Map<LocalDate, Evento> mapEvento;

    public AgendaEventos() {
        this.mapEvento = new HashMap<>();
    }
    
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        mapEvento.put(data, evento);
    }
    
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(mapEvento);
        System.out.println(eventosTreeMap);
    }
    
    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(mapEvento);
        for(Map.Entry<LocalDate, Evento> entry : mapEvento.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("Proximo evento: " + entry.getValue() + "acontecera na data " + entry.getKey());
                break;
            }
        }
        
    }
}
