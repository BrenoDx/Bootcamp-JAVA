/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv03;

import java.util.Scanner;

/**
 *
 * @author breno
 */
public class Atv03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try{
        System.out.println("Informe a base do retangulo");
        double base = Double.parseDouble(sc.nextLine().replace(",", "."));
        System.out.println("informe a altura do retangulo");
        double altura = Double.parseDouble(sc.nextLine().replace(",", "."));
        
        double area = base*altura;
            System.out.println("Area do retangulo: " + area);
        }catch(NumberFormatException e){
            System.out.println("Informe base/altura corretamente");
        }
    }
    
}
