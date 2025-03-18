/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binaryoperatorexample;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 *
 * @author breno
 */
public class BinaryOperatorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        
        // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
        
        // Usar o BinaryOperator para somar todos os números no Stream
        int resultado = numeros.stream()
                .reduce(0, somar);
        
        // Imprimir o resultado da soma
        System.out.println("A soma dos numeros e: " + resultado);
    }
    
}
