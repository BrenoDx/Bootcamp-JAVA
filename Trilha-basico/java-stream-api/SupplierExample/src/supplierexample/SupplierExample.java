/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supplierexample;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author breno
 */
public class SupplierExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";
        
        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = (List<String>) Stream.generate(saudacao)
                .limit(5)
                .toList();
        
        // Imprimir as saudações geradas
        listaSaudacoes.forEach(s -> System.out.println(s));
    }
    
}
