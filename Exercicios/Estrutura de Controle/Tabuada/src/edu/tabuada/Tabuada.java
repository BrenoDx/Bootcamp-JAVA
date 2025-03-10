/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.tabuada;

import java.util.Scanner;

/**
 *
 * @author breno
 */
public class Tabuada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Objeto para captura entrada de dados
        try {
            System.out.println("--------Bem vindo a Tabuada online--------");
            System.out.println("Escolha número de 1 á 10");
            int numero = Integer.parseInt(sc.nextLine()); // Recebendo o número pelo objeto Scanner
            
            //Laço de repetição for para andar até número 10 da nossa tabuada
            for (int i = 0; i <= 10; i++) {
                System.out.println(i + " X " + numero + " = " + i * numero);
            }
        } catch (NumberFormatException e) {
            //caso usuário não informa número
            System.out.println("Erro! informe um numero!");
        }
        sc.close(); // fechando objeto
    }
}
