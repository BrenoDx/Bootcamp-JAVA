/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Computador.apps;

/**
 *
 * @author breno
 */
public class Telegram extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternert();
        System.out.println("Enviando mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        validarConectadoInternert();
        System.out.println("Recebendo mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }

    @Override
    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico no Telegram");
    }

}
