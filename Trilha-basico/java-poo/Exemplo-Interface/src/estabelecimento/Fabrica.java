/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estabelecimento;

import equipamento.copiadora.Copiadora;
import equipamento.digitalizadora.Digitalizadora;
import equipamento.impressora.Deskjet;
import equipamento.impressora.Impressora;
import equipamento.impressora.Lasejet;
import equipamento.multifuncional.EquipamentoMultifuncional;

/**
 *
 * @author breno
 */
public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = new Deskjet();
        impressora.imprimir();
        
        Impressora impressora2 = new Lasejet();
        impressora2.imprimir();
        
        Impressora impressora3 = new EquipamentoMultifuncional();
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;
        
        impressora3.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
