/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iphone;

import java.util.Random;

/**
 *
 * @author breno
 */
public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private boolean pausar = false;
    private boolean desbloqueado = false;

    public boolean desbloquear() {
        if (!desbloqueado) {
            System.out.println("Desbloqueando........");
            desbloqueado = true;
        }

        return desbloqueado;

    }

    public void bloquear() {
        if (desbloqueado) {
            desbloqueado = false;
            System.out.println("Tela bloqueada");
        }
    }

    public int tocando() {
        int atendeu;
        do {

            atendeu = new Random().nextInt(3);
            System.out.println("Chamando....... ");

            if (atendeu == 2) {
                iniciarCorreioVoz();
                break;
            }
        } while (atendeu == 0);

        return atendeu;
    }

    public boolean despausar() {
        if (pausar) {
            pausar = false;
            tocar();
        }
        return pausar;
    }

    @Override
    public void ligar(int numero) {
        if (desbloqueado) {
            System.out.println("Ligando para: " + numero + " .........");
            if (tocando() == 1) {
                System.out.println("Ligação atendida");
            }
        } else {
            System.out.println("Tela bloqueada");
        }
    }

    @Override
    public void atender() {
        System.out.println("Telefone tocando.....");
        tocando();
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Caixa postal, deixe seu recado.........");
    }

    @Override
    public void exibirPagina(String url) {
        if (desbloqueado) {
            System.out.println("Acessando pagina.....\n" + url);
        }
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.....");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina...........");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando........");
    }

    @Override
    public void pausar() {
        if (!pausar) {
            System.out.println("Musica pausada");
            pausar = true;
        } else {
            System.out.println("Musica ja esta pausada!");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica " + musica);
        tocar();
    }
}
