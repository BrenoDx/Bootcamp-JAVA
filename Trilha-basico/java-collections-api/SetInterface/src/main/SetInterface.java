/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import SetConvidado.ConjuntoConvidados;

/**
 *
 * @author breno
 */
public class SetInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConjuntoConvidados conjuConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuConvidados.contarConvidados() + " dentro do Set de Convidados");

        conjuConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuConvidados.adicionarConvidado("Convidado 4", 1236);

        conjuConvidados.exibirConvidados();
        System.out.println("Existem " + conjuConvidados.contarConvidados() + " dentro do Set de Convidados");
        conjuConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + conjuConvidados.contarConvidados() + " dentro do Set de Convidados"); 
        conjuConvidados.exibirConvidados();
    }

}
