/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iphone;

/**
 *
 * @author breno
 */
public interface AparelhoTelefonico {
    public void ligar(int numero);
    public void atender();
    public void iniciarCorreioVoz();
    public int tocando();
    public void bloquear();
    public boolean desbloquear();
}
