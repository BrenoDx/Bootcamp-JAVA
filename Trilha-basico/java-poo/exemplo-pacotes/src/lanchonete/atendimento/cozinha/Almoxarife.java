
package lanchonete.atendimento.cozinha;

/**
 *
 * @author breno
 */
public class Almoxarife {
    private void controlarEntrada(){
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
    }
    private void controlandoSaida(){
        System.out.println("CONTROLANDO A SAIDA DOS ITENS");
    }
    void entregarIngredientes(){
        System.out.println("ENTREGANDO INGREDIENTES");
        controlandoSaida();
    }
    void trocarGas(){
        System.out.println("ALMOXARIFE TROCANDO O GAS");
    }
}
