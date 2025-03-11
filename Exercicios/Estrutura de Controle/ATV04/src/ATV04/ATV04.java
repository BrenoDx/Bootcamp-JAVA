/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ATV04;

import java.util.Scanner;

/**
 *
 * @author breno
 */
public class ATV04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Objeto para capturar entrada de dados
        int numeros;
        boolean status = false;
        
        // Try/catch para prevenir um suposto erro de sistema
        try{
        System.out.println("Informe o primeiro numero");
        int numero1 = Integer.parseInt(sc.nextLine());
        
        // do-while para usuario informa até encontrar resto != 0
        do{
            System.out.println("Informa numero para divisao (Precisa ser igual ou maior que o primeiro numero)");
            numeros = Integer.parseInt(sc.nextLine());
            if(numero1 >= numeros){
                status = numero1 % numeros == 0;
                
            }
            
        }while(status);
        }catch(NumberFormatException e){
            System.out.println("Numero Incorreto!");  
        }
    }
    
}
