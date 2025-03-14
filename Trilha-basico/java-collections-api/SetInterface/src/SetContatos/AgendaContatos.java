/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SetContatos;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author breno
 */
public class AgendaContatos {
    private Set<Contato> setContato;
    
    public AgendaContatos(){
        this.setContato = new HashSet<>();
    }
    
    public void adicionarContato(String nome, int numero){
        setContato.add(new Contato(nome,numero));
    }
    
    public void exibirContatos(){
        System.out.println(setContato);
    }
    
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c : setContato){
            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }
    
    public Contato atualizarNumeroContato(String nome, int numero){
        Contato contatoAtualizado = null;
        for(Contato c : setContato){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}
