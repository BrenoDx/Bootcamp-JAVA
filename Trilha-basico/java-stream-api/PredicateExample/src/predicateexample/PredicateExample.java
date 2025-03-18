/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package predicateexample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author breno
 */
public class PredicateExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criar uma lista de palavras
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "JavaScript", "C", "Go", "Ruby");
        
        // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
        
        // Usar o Stream para filtra as palavras com mais de 5 caracteres e, em seguinda,
        // imprimir cada palavra que passou no filtro
        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println); 
    }
    
}
