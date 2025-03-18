/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package functionexample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author breno
 */
public class FunctionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        
        // Usar a function com expressão lambda para dobrar todos os numeros
        Function<Integer, Integer> dobrar = numero -> numero * 2;
        
        // Usar a função para dobrar todos os números no Stream e armazená- los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .collect(Collectors.toList());
        
        // Imprimir a lista de números dobrados
        numerosDobrados.forEach(n -> System.out.println(n));
    }
    
}
