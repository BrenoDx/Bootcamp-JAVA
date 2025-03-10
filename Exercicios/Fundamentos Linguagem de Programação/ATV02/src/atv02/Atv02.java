/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv02;

import java.util.Scanner;

/**
 *
 * @author breno
 */
public class Atv02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try{
        System.out.println("Informe o tamanho do lado de um quadrado");
        double lado = Double.parseDouble(sc.nextLine().replace(",", "."));
        
        double area = lado*lado;
            System.out.println("Calculo da area de um quadrado e: " + area);
        }catch(NumberFormatException e){
            System.out.println("Informe corretamente o lado do quadrado");
        }
    }
    
}
