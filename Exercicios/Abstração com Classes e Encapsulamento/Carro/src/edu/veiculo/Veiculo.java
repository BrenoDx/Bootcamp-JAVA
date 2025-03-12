/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.veiculo;

/**
 *
 * @author breno
 */
public class Veiculo {

    private int velocidade = 0, marcha = 0;
    private boolean ligado = false;

    public boolean ligar() {
        if (!ligado) {
            System.out.println("Ligando o carro");
            ligado = true;
            return ligado;
        } else {
            System.out.println("Carro já está ligado");
        }
        return ligado;
    }

    public boolean desligar() {
        if (ligado) {
            System.out.println("Desligando o carro");
            ligado = false;
        } else {
            System.out.println("Carro já está desligado");
        }
        return ligado;
    }

    public void acelerar() {
        if (ligado && velocidade < 120) {
            switch (marcha) {
                case 1:
                    if (velocidade <= 20) {
                        velocidade++;
                    }
                    break;
                case 2:
                    if (velocidade <= 40) {
                        velocidade++;
                    }
                    break;
                case 3:
                    if (velocidade <= 60) {
                        velocidade++;
                    }
                    break;
                case 4:
                    if (velocidade <= 80) {
                        velocidade++;
                    }
                    break;
                case 5:
                    if (velocidade <= 100) {
                        velocidade++;
                    }
                    break;
                case 6:
                    if (velocidade <= 120) {
                        velocidade++;
                    }
                    break;
            }

        }

    }

    public void desacelerar() {
        if (ligado && velocidade > 0) {
            velocidade--;
        }
    }

    public void virarEsquerda() {
        if (ligado && velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando a esquerda");
        }
    }

    public void virarDireita() {
        if (ligado && velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando a direita");
        }
    }

    public int aumentarMarcha() {
        if (ligado && marcha <= 6) {
            marcha++;
        }
        return marcha;
    }

    public int reduzirMarcha() {
        if (ligado && marcha >= 0) {
            marcha--;
        }
        return marcha;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

}
