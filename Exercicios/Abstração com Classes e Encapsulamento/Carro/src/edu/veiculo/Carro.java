/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.veiculo;

/**
 *
 * @author breno
 */
public class Carro {

    public static void main(String[] args) {
        Veiculo meuCarro = new Veiculo();

        meuCarro.ligar();
        meuCarro.aumentarMarcha();

        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        System.out.println("Velocidade: " + meuCarro.getVelocidade() + "KM");
        System.out.println("Marcha: " + meuCarro.getMarcha());
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        System.out.println("Velocidade: " + meuCarro.getVelocidade() + "KM");
        System.out.println("Marcha: " + meuCarro.getMarcha());
        
        meuCarro.virarDireita();
        meuCarro.virarEsquerda();
        meuCarro.desligar();
      

    }
}
