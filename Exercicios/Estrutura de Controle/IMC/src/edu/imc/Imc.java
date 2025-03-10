/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.imc;

import java.util.Scanner;

/**
 *
 * @author breno
 */
public class Imc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Objeto para captura entrada de dados
        System.out.println("----------Seja bem vindo a calculo IMC-----------");
        try {
            
            System.out.println("Informe seu peso!");
            double peso = Double.parseDouble(sc.nextLine()); // Recebendo o peso
            System.out.println("Informe sua altura!");
            double altura = Double.parseDouble(sc.nextLine()); // Recebendo altura
            
            double resultado = peso / (altura * altura); // Processamento do resultado do nosso imc
            
            // Situação do usuário de acordo com resultado do imc
            if (resultado <= 18.5) {
                System.out.println("Abaixo do peso");
            } else if (resultado <= 24.9) {
                System.out.println("Peso ideal");
            } else if (resultado <= 29.9) {
                System.out.println("Levemente acima do peso");
            } else if (resultado <= 34.9) {
                System.out.println("Obesidade grau |");
            } else if (resultado <= 39.9) {
                System.out.println("Obesidade grau || (Severa)");
            } else {
                System.out.println("Obesidade grau ||| (Morbida)");
            }
            
        } catch (NumberFormatException ex) {
            // Caso usuário informa dados errado
            System.out.println("Informe altura e peso corretamente");
        }
        sc.close();
    }
}
