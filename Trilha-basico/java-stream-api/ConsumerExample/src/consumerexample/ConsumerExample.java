/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consumerexample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author breno
 */
public class ConsumerExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criar uma lista de números intieros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        
        // Usar o Cosumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero ->{
          if(numero % 2 == 0){
              System.out.println(numero);
          }  
        };
        // Usar o Consumer para imprimir números pares no Stream
        numeros.stream().forEach(imprimirNumeroPar);
    }
    
}
