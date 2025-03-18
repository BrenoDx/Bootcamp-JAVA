/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package par.impar;

import java.util.Scanner;

/**
 *
 * @author breno
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Objeto para capturar entrada de dados
        int numero1, numero2, escolha;

        // Try/catch para prevenir um suposto erro de sistema
        try {
            // do-while para usuario informa até que o segundo numero for maior que o primeiro  
            do {
                System.out.println("Informe o primeiro numero");
                numero1 = Integer.parseInt(sc.nextLine());

                System.out.println("Informe o segundo numero (Precisa ser maior que o primeiro!)");
                numero2 = Integer.parseInt(sc.nextLine());

                System.out.println("1 - Impar/ 2 - Par");
                escolha = Integer.parseInt(sc.nextLine());

            } while (numero2 < numero1);
            // Switch  1 - Impar 2 - Par
            switch (escolha) {
                case 1:
                    for (int i = numero2; i >= numero1; i--) {
                        if (i % 2 != 0) {
                            System.out.println("Impar: " + i);
                        }
                    }
                    break;

                case 2:
                    for (int i = numero2; i >= numero1; i--) {
                        if (i % 2 == 0) {
                            System.out.println("Par: " + i);
                        }
                    }
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }

        } catch (NumberFormatException e) {
            System.out.println("Numero incorreto");

        }

    }

}
