/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Computador.apps;

/**
 *
 * @author breno
 */
public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    
    protected abstract void salvarHistoricoMensagem();
    
    protected void validarConectadoInternert(){
        System.out.println("Validando se está conectado");
    }
}
