/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListLivros;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author breno
 */
public class Catalogo {
    private List<Livro> lista;

    public Catalogo() {
        this.lista = new ArrayList<>();
    }
    
    public void adicionarLivro(String titulo, String autor, int ano){
        lista.add(new Livro(titulo, autor, ano));
    }
    
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!lista.isEmpty()){
            for(Livro l : lista){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!lista.isEmpty()){
            for(Livro l : lista){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }
    
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        
        if(!lista.isEmpty()){
            for(Livro l : lista){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;  
    }

}
