/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author breno
 */
public class Banco {

    private List<Cliente> lista;
    
    public Banco() {
        this.lista = new ArrayList<>();
    }
    
    public void adicionarCadastro(Cliente cliente) {
        lista.add(cliente);
    }

    public void listar() {
        
        System.out.println(lista);
    }
    
}
