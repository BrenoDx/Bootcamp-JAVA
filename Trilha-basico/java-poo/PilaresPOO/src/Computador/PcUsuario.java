/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Computador;

import Computador.apps.ServicoMensagemInstantanea;
import Computador.apps.FacebookMessenger;
import Computador.apps.MSNMessenger;
import Computador.apps.Telegram;

/**
 *
 * @author breno
 */
public class PcUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;
        
        String appEscolhido="msn";
        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();
        
        smi.enviarMensagem();
        smi.receberMensagem();
        
    }
    
}
