/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv01;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author breno
 */
public class ATV01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe seu nome");
        String nome = sc.nextLine();
        System.out.println("Informe seu ano de nascimento");
        int ano = sc.nextInt();
                
        int idade = Year.now().getValue() - ano;
        
        System.out.println("Ola " + nome + " voce tem " + idade + " anos");
    }
    
}
