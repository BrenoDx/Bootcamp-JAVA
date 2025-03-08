package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;

/**
 *
 * @author breno
 */
public class Estabelecimento {

    public static void main(String[] args) {
        // TODO code application logic here
        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarComboNoBalcao();
        
        Atendente atd = new Atendente();
        atd.servindoMesa();
        atd.receberPagamento();
        
        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
    }

}
