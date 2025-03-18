/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MapEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

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
    
 
}
