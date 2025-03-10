/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv04;

import java.util.Scanner;

/**
 *
 * @author breno
 */
public class Atv04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Informe seu nome");
            String nome1 = sc.nextLine();
            System.out.println("Informe sua idade");
            int idade1 = Integer.parseInt(sc.nextLine());

            System.out.println("Informe o nome do usuario 2");
            String nome2 = sc.nextLine();
            System.out.println("Informe a idade do usuario 2");
            int idade2 = Integer.parseInt(sc.nextLine());

            int diferenca = idade1 - idade2;
            System.out.println("A diferenca de idade do " + nome1 + " para " + nome2 + " e de " + diferenca + " anos");
        } catch (NumberFormatException e) {
            System.out.println("Informe a idade corretamente");
        }
    }

}
