package equipamento.multifuncional;

import equipamento.copiadora.Copiadora;
import equipamento.digitalizadora.Digitalizadora;
import equipamento.impressora.Impressora;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author breno
 */
public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar(){
        System.out.println("Copiando via equipamento multifuncional");
    }
    public void digitalizar(){
        System.out.println("Digitalizando via equipamento multifuncional");
    }
    public void imprimir(){
        System.out.println("Imprimir via equipamento multifuncional");
    }
}
