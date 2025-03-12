/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.veiculo;

import java.util.Scanner;

/**
 *
 * @author breno
 */
public class Carro {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Veiculo meuCarro = new Veiculo();
        int opcao;
        
        do{
            System.out.println("----------Carro do fulano-----------");
            System.out.println("1 - Ligar.");
            System.out.println("2 - Desligar");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Desacelerar");
            System.out.println("5 - Virar a esquerda");
            System.out.println("6 - Virar a direito");
            System.out.println("7 - Aumentar a marcha");
            System.out.println("8 - Reduzir a marcha");
            System.out.println("9 - Vereficar velocidade");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao) {
                case 1:
                    meuCarro.ligar();
                    break;
                case 2:
                    meuCarro.desligar();
                    break;
                case 3:
                    meuCarro.acelerar();
                    break;
                case 4:
                    meuCarro.desacelerar();
                    break;
                case 5:
                    meuCarro.virarEsquerda();
                    break;
                case 6:
                    meuCarro.virarDireita();
                    break;
                case 7:
                    meuCarro.aumentarMarcha();
                    break;
                case 8:
                    meuCarro.reduzirMarcha();
                    break;
                case 9:
                    meuCarro.getVelocidade();
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }while(opcao != 2);
    }
}
