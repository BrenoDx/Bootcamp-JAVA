/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MapEventos;

import java.util.Collections;

/**
 *
 * @author breno
 */
public class Evento {
    private String nome;
    private String atracao;
    
    public Evento(String nome, String atracao){
        this.nome = nome;
        this.atracao = atracao;
    }
    public String getNome() {
        return nome;
    }
    public String getAtracao(){
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento{" + "nome=" + nome + ", atracao=" + atracao + '}';
    }
    
    
    
}
