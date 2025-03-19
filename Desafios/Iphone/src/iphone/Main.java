/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iphone;

/**
 *
 * @author breno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        iphone.desbloquear();
        iphone.ligar(410810);
        
        iphone.exibirPagina("Facebook");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
        
        iphone.selecionarMusica("musica 1");
        iphone.pausar();
        iphone.despausar();
    }
    
}
