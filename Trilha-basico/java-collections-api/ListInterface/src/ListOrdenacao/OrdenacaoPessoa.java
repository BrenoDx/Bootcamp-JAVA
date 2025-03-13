/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListOrdenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author breno
 */
public class OrdenacaoPessoa {
    private List<Pessoa> lista;
    
    public OrdenacaoPessoa(){
        this.lista = new ArrayList<>();
    }
    
    public void adicionarPessoa(String nome, int idade, double altura){
        lista.add(new Pessoa(nome, idade, altura));
    }
    
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listaPorIdade = new ArrayList<>(lista);
        Collections.sort(listaPorIdade);
        return listaPorIdade;
    }
    
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listaPorAltura = new ArrayList<>(lista);
        Collections.sort(listaPorAltura, new ComparatorPorAltura());
        return listaPorAltura;
    }
}
